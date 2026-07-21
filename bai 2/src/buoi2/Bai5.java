package buoi2;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập thông tin nhân viên: ");
        String rawInput = scanner.nextLine();

        // 1. Loại bỏ khoảng trắng 2 đầu và tách mảng theo dấu "-"
        String[] parts = rawInput.trim().split("-");

        if (parts.length < 4) {
            System.out.println("Thông tin nhập vào không đúng định dạng!");
            return;
        }

        // 2. Trích xuất và trim() các trường thông tin
        String code = parts[0].trim();
        String rawName = parts[1].trim();
        String rawYear = parts[2].trim();
        String department = parts[3].trim();

        // 3. Chuẩn hóa họ tên
        String formattedName = capitalizeName(rawName);

        // 4. Kiểm tra phòng ban
        if (department.toLowerCase().contains("kỹ thuật") || department.toLowerCase().contains("ky thuat")) {
            System.out.println("Phân loại: Nhân viên kỹ thuật");
        } else {
            System.out.println("Phân loại: Nhân viên nghiệp vụ");
        }

        // 5. Tính tuổi và in kết quả định dạng
        int birthYear = Integer.parseInt(rawYear);
        int age = 2026 - birthYear;

        System.out.println("Mã nhân viên: " + code +
                " | Họ và tên: " + formattedName +
                " | Tuổi: " + age +
                " | Bộ phận: " + department);
    }

    public static String capitalizeName(String name) {
        // Tách chuỗi tên thô thành các từ riêng biệt bằng một hoặc nhiều khoảng trắng
        String[] words = name.split("\\s+");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > 0) {
                // Viết hoa chữ đầu, viết thường các chữ sau
                String firstChar = word.substring(0, 1).toUpperCase();
                String remaining = word.substring(1).toLowerCase();

                result += firstChar + remaining;
                if (i < words.length - 1) {
                    result += " "; // Thêm khoảng trắng giữa các từ
                }
            }
        }
        return result.trim();
    }
}
