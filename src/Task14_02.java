import java.util.Scanner;

public class Task14_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((i == 0 || j == 0 || i == n / 2) ? "*" : " ");
            }
            System.out.print("\n");
        }
    }
}
