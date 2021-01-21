import java.util.Scanner;

public class Task08_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String ans = "n=" + n + ": ";
        String[] family = {"Courier, ", "Times, ", "Arial, ", "Helvetica, "};
        String[] style = {"plain, ", "italic, ", "oblique, ", "illegal"};
        String[] weight = {"normal, ", "bold, "};
        String[] size = {"x-small", "small", "medium", "large", "x-large"};
        if (((n >> 2) & 0b11) == 3) {
            System.out.println(ans + "illegal style");
            return;
        }
        if (n >> 5 > 4) {
            System.out.println(ans + "illegal size");
            return;
        }
        ans += family[n & 0b11];
        ans += style[(n >> 2) & 0b11];
        ans += weight[(n >> 3) & 1];
        ans += size[n >> 5];
        System.out.println(ans);
        scanner.close();
    }
}
