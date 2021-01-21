import java.util.Scanner;

public class Task09_02_fix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        double[] arrd = {Integer.MAX_VALUE, 4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.0, Integer.MIN_VALUE};
        String[] arrs = {"", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "F", ""};

        for (int i = 1; i < arrd.length - 1; i++) {
            double var = Math.abs(grade - arrd[i]);
            if (var <= Math.abs(grade - arrd[i + 1]) && var < Math.abs(grade - arrd[i - 1])) {
                System.out.println(arrs[i]);

                return;
            }
        }


    }
}