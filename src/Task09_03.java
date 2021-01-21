import java.util.Scanner;

public class Task09_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = Integer.parseInt(scanner.nextLine());
        String cf = scanner.nextLine();
        int alti = Integer.parseInt(scanner.nextLine());
        String mf = scanner.nextLine();
        if (cf.equals("F")) {
            temp = (temp - 32) * 5 / 9;
        }
        if (mf.equals("F")) {
            alti = (int) (alti / 3.281);
        }
        if (temp >= 100 - (alti / 300)) {
            System.out.println("Water is gaseous.");
        } else if (temp <= 0) {
            System.out.println("Water is solid.");
        } else {
            System.out.println("Water is liquid.");
        }
    }
}
