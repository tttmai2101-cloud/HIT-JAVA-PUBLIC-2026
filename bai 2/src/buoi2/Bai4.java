package buoi2;
import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng học sinh: ");
        int n = Integer.parseInt(scanner.nextLine());
        // tạo mảng
        double[] scores = new double[n];
        // nhập mảng
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập điểm học sinh thứ " + (i + 1) + ": ");
            scores[i] = Double.parseDouble(scanner.nextLine());
        }

        // Gọi các hàm và in kết quả ra màn hình
        System.out.println("Điểm cao nhất: " + findMax(scores));
        System.out.printf("Điểm trung bình lớp: %.2f%n", calculateAverage(scores));
        System.out.println("Số học sinh dưới trung bình: " + countFailedStudents(scores));
    }
// hàm tìm giá trị lowns nhất
    public static double findMax(double[] arr) {
        double max = arr[0];
        for (int i=0; i< arr.length -1 ; i++){
            if (arr[i]> max){
                max= arr[i];
            }
        }
        return max;
    }
// tính điểm trung binình
    public static double calculateAverage(double[] arr) {
        double sum = 0;
        for (int i=0; i<arr.length ; i++){
            sum+= arr[i];
        }
        return (double) sum / arr.length;
    }
//đếm số học sinh có điểm dưới 5.
    public static int countFailedStudents(double[] arr) {
        int count = 0;
        for (double diem: arr){
            if ( diem< 5.0 ){
                count+=1;
            }
        }
        return count;
    }
}
