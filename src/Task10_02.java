
import java.util.Scanner;

public class Task10_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even number");
        } else {
            for (int i = n; i > 0; i -= 2) {
                for (int j = 0; j < (n - i) / 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < (n - i) / 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("");
            }
        }

    }
}
