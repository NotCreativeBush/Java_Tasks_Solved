import java.util.Scanner;

public class Task10_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 31; i >= 0; i--) {
            System.out.print((n >> i) & 1);
        }
    }
}
