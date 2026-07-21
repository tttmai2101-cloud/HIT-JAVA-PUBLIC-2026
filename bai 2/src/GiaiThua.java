import java.util.Scanner;

public class GiaiThua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap mot so");
        int n = scanner.nextInt();
        double giaiThua =1;
        int tong =0;
        for (int i=1; i<=n; i++){
            giaiThua *= i;
        }
    }
}
