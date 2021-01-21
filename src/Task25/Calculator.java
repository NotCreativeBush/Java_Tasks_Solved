package Task25;

public class Calculator extends CalculatingDevice {
    public Calculator(String name) {
        super(name);
    }

    @Override
    public String calculate(double x, double y) {
        double subt = x - y;
        return super.calculate(x, y) + "; " + x + "-" + y + "=" + subt;
    }

}
