import java.util.Scanner;

public class Task09_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the name of the employee?");
        String name = scanner.nextLine();
        System.out.println("What is the salary of the employee?");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("How many hours has the employee worked in the past week?");
        double hours = Double.parseDouble(scanner.nextLine());
        System.out.println(salary * Math.min(hours, 40) + (salary * Math.max(0, (hours - 40))) * 1.5);
    }
}
