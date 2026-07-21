package buoi2;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập cạnh b: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập cạnh c: ");
        int c = Integer.parseInt(scanner.nextLine());
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            if (a == b && a == c && b == c) {
                System.out.print("là tam giac đều ");
            } else if ((a == b) || (a == c) || (b == c)) {
                System.out.print(" la tam giac can ");
            } else {
                System.out.print(" la tam giac thuong ");
            }
            double p = (a + b + c) / 2.0;
            double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.printf("dien tich tam giac là: %.2f ", dienTich);
        } else {
            System.out.print(" 3 canh không tạo thành tam giac hợp lệ");
        }
    }
}