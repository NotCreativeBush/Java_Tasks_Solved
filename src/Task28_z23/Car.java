package Task28_z23;

public class Car {
    private String make;
    private int price;
    private Car next;

    public Car(String m, int p, Car n) {
        this.make = m;
        this.price = p;
        this.next = n;
    }

    public Car(String make, int price) {
        this(make, price, null);
    }

    public String getMake() {
        return make;
    }

    public int getPrice() {
        return price;
    }

    public Car getNext() {
        return next;
    }

    public void showCars() {
        System.out.print(this + " ");
        if (getNext() != null) {
            getNext().showCars();
        }
    }

    public void showCarsRev() {
        if (getNext() != null) {
            getNext().showCarsRev();
        }
        System.out.print(this + " ");
    }

    @Override
    public String toString() {
        return this.make + "(" + price + ")";
    }
}
