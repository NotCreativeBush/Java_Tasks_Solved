package Task28_z23;

public class Task {
    double x, y;

    public Task(double a, double b) {
        x = a;
        y = b;
    }

    public double execute() {
        throw new UnsupportedOperationException();
    }

    public static Task getInstance(String oper, double a, double b) {
        switch (oper) {
            case "+":
                return new Adder(a, b);
            case "-":
                return new Substractor(a, b);
            case "*":
                return new Multiplier(a, b);
            default:
                return new Divider(a, b);
        }
    }
}
