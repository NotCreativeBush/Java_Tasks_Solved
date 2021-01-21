import java.util.Scanner;

public class Task11_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, ans;
        ans = 0;
        while (true) {
            n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            if (((n >> 8) & 0b0011111111) % 2 == 1) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
