import java.util.Scanner;
public class proje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            double m = n - 0.5;
            for (int k = -1; k < i; k++) System.out.print(" ");
            while (m > i) {
                System.out.print("*");
                m -= 0.5;
            }
            System.out.println();
        }
    }
}
