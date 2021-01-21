import java.util.Scanner;

public class Task16_01 {
    public static void main(String[] args) {
        String[][] arr = {{"Kenya", "Nairobi"}, {"Rwanda", "Kigali"}, {"Gambia", "Banjul"}, {"Ghana", "Accra"}, {"Niger", "Niamey"}, {"Zambia", "Lusaka"}};
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        boolean found = false;
        for (String[] x : arr) {
            if (x[0].equalsIgnoreCase(country)) {
                System.out.println(x[1]);
                found = true;
                break;
            }
        }
        if (found == false) {
            System.out.println("Country not found. :(");
        }
    }
}
