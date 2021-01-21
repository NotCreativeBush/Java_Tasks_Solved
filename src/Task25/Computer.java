package Task25;

public class Computer extends Calculator {
    public Computer(String name) {
        super(name);
    }

    @Override
    public String calculate(double x, double y) {
        double mult = x * y;
        double div = x / y;
        return super.calculate(x, y) + "; " + x + "*" + y + "=" + mult + "; " + x + "/" + y + "=" + div;
    }
}
