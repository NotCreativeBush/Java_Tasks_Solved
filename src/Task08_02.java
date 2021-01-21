import java.util.Scanner;

public class Task08_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println((a + b > c && a + c > b && b + c > a) ? "OK" : "NOT OK");

        scanner.close();
    }
}
