package Task20;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }

    int compareTo(Person person) {
        return this.age - person.age;
    }

    static void sort(Person[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[index]) < 0) {
                    index = j;
                }
            }
            Person tmp = arr[index];
            arr[index] = arr[i];
            arr[i] = tmp;
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("Mary", 18);
        Person[] arrp = {new Person("Mary", 18), new Person("Sasha", 21), new Person("Borys", 14)};
        Person.sort(arrp);
        for (Person x : arrp) {
            System.out.println(x.toString());
        }

    }
}
