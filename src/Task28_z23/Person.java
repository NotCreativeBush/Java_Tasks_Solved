package Task28_z23;


public class Person {
    private String name;
    private Car cars;

    public Person(String name) {
        this.name = name;
    }

    public Person buys(String make, int price) {
        cars=new Car(make,price,cars);
        return this;
    }

    public String getName() {
        return name;
    }

    public void showCars() {
        cars.showCars();
    }

    public void showCarsRev() {
        cars.showCarsRev();
    }

    public int getTotalPrice() {
        int sum = cars.getPrice();
        Car car = cars;
        while (car.getNext() != null) {
            car = car.getNext();
            sum += car.getPrice();
        }
        return sum;
    }

    public boolean hasCar(String make) {
        Car car = cars;
        while (car != null) {
            if (car.getMake().equalsIgnoreCase(make)) {
                return true;
            }
            car=car.getNext();
        }
        return false;
    }

    public Car mostExpensive() {
        Car maxPrice = cars;
        Car car = cars;
        while (car.getNext() != null) {
            car = car.getNext();
            if (maxPrice.getPrice() < car.getPrice()) {
                maxPrice = car;
            }
        }
        return maxPrice;
    }
}
