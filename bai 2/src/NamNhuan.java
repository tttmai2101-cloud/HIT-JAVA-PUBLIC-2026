import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap nam can kiem tra ");
        int nam = scanner.nextInt();
        if ( (( nam % 4 == 0) && ( nam % 100 !=0)) || (nam % 400==0) ) {
            System.out.print("la nam nhuan ");
        } else {
            System.out.print("khong la nam nhuan ");
        }

    }
}