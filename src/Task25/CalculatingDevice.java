package Task25;

public class CalculatingDevice {
    protected String name;

    public CalculatingDevice(String name) {
        this.name = name;
    }

    public String calculate(double x, double y) {
        double sum = x + y;
        return name + ": " + x + "+" + y + "=" + sum;
    }

    public static void printRes(CalculatingDevice[] a, double x, double y) {
        for (CalculatingDevice calculatingDevice : a) {
            System.out.println(calculatingDevice.calculate(x, y));
        }
    }

}
