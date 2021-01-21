package Task20;

public class Main {
    public static void main(String[] args) {
        Car mazda = new Car("Mazda", 15000);
        Car bmw = new Car("BMW", 20000);
        Person02[] arrPerson02 = {new Person02("Sasha", bmw), new Person02("Mary", mazda), new Person02("Borys")};
        for (Car x : Person02.getCars(arrPerson02)) {
            System.out.println(x.toString());
        }
        for (Car x : Person02.expensiveCars(arrPerson02, 17000)) {
            System.out.println(x.toString());
        }

    }
}
