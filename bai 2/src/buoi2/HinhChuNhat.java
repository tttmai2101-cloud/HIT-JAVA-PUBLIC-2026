package buoi2;

import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap do dai hinh chu nhat ");
        double dai = scanner.nextDouble();
        System.out.print("Nhap do rong hinh chu nhat ");
        double rong = scanner.nextDouble();
        System.out.println("chu vi hinh chu nhan la " + (dai + rong) * 2);
        System.out.print("dien tich " + (dai * rong));
        System.out.print("Nhap nam can kiem tra ");
    }
}
