import java.util.Scanner;

public class Task08_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three boolean values (true or false)");

        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();
        boolean c = scanner.nextBoolean();

        boolean allThree = a && b && c;
        boolean exactlyOne = ((a && !(b || c)) || (b && !(a || c)) || (c && !(b || a)));
        boolean exactlyTwo = (a && b) && !c || (a && c) && !b || (b && c) && !a;
        boolean atLeastOne = a || b || c;
        boolean atLeastTwo = (a && b) || (a && c) || (b && c);

        System.out.println("a, b, c =" + a + ", " + b + ", " + c + "\nallThree:   " + allThree + "\nexactlyOne:  " + exactlyOne + "\nexactlyTwo:  " + exactlyTwo + "\natLeastOne:  " + atLeastOne + "\natLeastTwo:  " + atLeastTwo);


        scanner.close();
    }
}
