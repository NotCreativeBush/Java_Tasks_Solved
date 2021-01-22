package Task26_z21;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("E:\\Java Tasks\\src\\Task26_z21\\DataFile.txt"));


            int n = Integer.parseInt(scanner.nextLine());
            Person[] arr = new Person[n];
            for (int i = 0; i < n; i++) {
                String[] person = scanner.nextLine().split(" ");
                if (person.length == 2) {
                    arr[i] = new Person(person[0], Integer.parseInt(person[1]));
                } else {
                    arr[i] = new Person(person[0], Integer.parseInt(person[1]), new Car(person[2], Integer.parseInt(person[3]), Integer.parseInt(person[4]), Integer.parseInt(person[5])));
                }
            }
            Car[] fac = Person.findAllCars(arr);
            for (Car x : fac) {
                System.out.println(x);
            }
            System.out.println();
            Person[] fo = Person.findOwners(arr, "Mercedes");
            for (Person x : fo) {
                System.out.println(x);
            }
            System.out.println();
            System.out.println(Person.findColor(arr, "Alice", 1993));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


}
