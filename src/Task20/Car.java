package Task20;

public class Car {
    private String make;
    private int price;

    public Car(String name, int i) {
        this.make = name;
        this.price = i;
    }

    public int getPrice() {
        return price;
    }

    public String getMake() {
        return make;
    }

    @Override
    public String toString() {
        return make + " " + price;
    }
}
