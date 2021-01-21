import java.util.Scanner;

public class Task07_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int t;
        while (a > b | a > c | b > c) {
            if (a > b) {
                t = a;
                a = b;
                b = t;
            }
            if (b > c) {
                t = c;
                c = b;
                b = t;
            }
        }
        System.out.println(a + " " + b + " " + c);
    }
}
