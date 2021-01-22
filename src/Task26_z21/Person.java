package Task26_z21;

import java.awt.*;

public class Person {
    private String name;
    private int birthYear;
    private Car car;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person(String name, int birthYear, Car car) {
        this.name = name;
        this.birthYear = birthYear;
        this.car = car;
    }

    public static Car[] findAllCars(Person[] persons) {
        Car[] ans = new Car[persons.length];
        int i = 0;
        for (Person person : persons) {
            if (person.car != null) {
                ans[i] = person.car;
                i++;
            }
        }
        Car[] realans = new Car[i];
        System.arraycopy(ans, 0, realans, 0, i);
        return realans;
    }

    public static Person[] findOwners(Person[] persons, String make) {
        Person[] ans = new Person[persons.length];
        int i = 0;
        for (Person person : persons) {
            if (person.car != null && person.car.getMake().equals(make)) {
                ans[i] = person;
                i++;
            }
        }
        Person[] realans = new Person[i];
        System.arraycopy(ans, 0, realans, 0, i);
        return realans;
    }

    public static Color findColor(Person[] person, String name, int year) {
        for (Person p : person) {
            if (p.name.equals(name) && p.birthYear == year) {
                if (p.car != null)
                    return p.car.getColor();
                return null;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        if (car != null)
            return name + " " + birthYear + " " + car.toString();
        return name + " " + birthYear;
    }
}
