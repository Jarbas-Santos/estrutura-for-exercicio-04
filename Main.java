import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (b == 0) {
                System.out.println("divisao impossivel");
            }
            else {
                double result = (double) a / b;
                System.out.printf("%.1f%n", result);
            }
        }

        sc.close();
    }
}
