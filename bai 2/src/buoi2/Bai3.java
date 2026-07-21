package buoi2;
import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mật khẩu: ");
        String password = scanner.nextLine();
        // 1. Cắt khoảng trắng thừa
        String cleanedPassword = password.trim();
        int length = cleanedPassword.length();

        // 2. Khai báo các biến cờ hiệu logic
        boolean hasDigit = false;
        boolean hasUpper = false;

        // 3. Sử dụng vòng lặp duyệt qua từng ký tự
        for (int i = 0; i < length; i++) {
            char c = cleanedPassword.charAt(i);
            if (c >= '0' && c <= '9') {
                hasDigit= true;
            }
            if (c >= 'A' && c <= 'Z') {
                hasUpper = true;
            }
        }

         // kiem tra mật khẩu
        if (length >8  ){
            if (hasDigit){
                if (hasUpper){
                    System.out.print(" mat khau thoa man");
                } else {
                    System.out.print(" mat khau can it nhat mot chu cái viết hoa");
                }
            }else if (hasUpper){
                System.out.print(" mat khau can it nhat mot chu số");
            } else{
                System.out.print(" mat khau can it nhat mot chu cái viết hoa va một chữ số");
            }
        }else {
            System.out.print("Mật khẩu không hợp lệ! \n " +
                    " độ dài mật khẩu không hợp lệ");
        }
    }
}
