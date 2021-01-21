package Task20;

import java.util.ArrayList;

public class Person02 {
    private String name;
    private Car car;

    public Person02(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public Person02(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return name + " " + car.toString();
    }

    public static Car[] getCars(Person02[] arr) {

        ArrayList<Car> ans = new ArrayList<Car>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getCar() != null) {
                ans.add(arr[i].getCar());
            }
        }

        return ans.toArray(new Car[0]);
    }

    public static Car[] expensiveCars(Person02[] arr, int minPrice) {
        ArrayList<Car> ans = new ArrayList<Car>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getCar() != null && arr[i].getCar().getPrice() >= minPrice) {
                ans.add(arr[i].getCar());
            }
        }

        return ans.toArray(new Car[0]);
    }
}
