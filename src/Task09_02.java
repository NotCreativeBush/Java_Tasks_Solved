import java.util.Scanner;

public class Task09_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        double[] arrd = {4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.0};
        String[] arrs = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "F"};
        if (grade < 0.5) {
            System.out.println("F");
            return;
        }
        if (grade < 1.0) {
            System.out.println("D");
        }
        for (int i = 0; i < arrd.length; i++) {
            if (Math.abs(grade - arrd[i]) <= 0.15) {
                System.out.println(arrs[i]);

                return;
            }
        }


    }
}
