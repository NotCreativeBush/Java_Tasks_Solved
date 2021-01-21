import java.util.Scanner;

public class Task08_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a -> ");
        int a = scan.nextInt();
        System.out.print("Enter b -> ");
        int b = scan.nextInt();
        scan.close();
        String s1 = (a == b) ? " = " : " != ";
        String s2 = (a == b) ? " = " : (a < b) ? " < " : " > ";
        System.out.println(a + s1 + b);
        System.out.println(a + s2 + b);
    }
}
