public
class OneLiners {

    public static boolean hasTwoRoots(double a, double b, double c) {
        return a != 0 && ((b * b) - (4 * a * c) > 0);
//TODO returns true if, and only if, the equation ax^2 + bx + c has exactly two different solutions, and false otherwise;
    }

    public static boolean monot(double a, double b, double c) {
        return ((a > b) && (b > c) || (a < b) && (b < c));
//TODO returns true if, and only if, the numbers a, b and c constitute a strictly increasing sequence (each subsequent term is bigger than the previous) or a strictly decreasing one, and false otherwise;
    }

    public static double maxEl(double a, double b, double c) {
        return Math.max(a, Math.max(b, c));
//TODO returns the maximum value of the numbers a, b and c;
    }

    public static int numPos(double a, double b, double c) {
        return (a > 0 ? 1 : 0) + (b > 0 ? 1 : 0) + (c > 0 ? 1 : 0);
//TODO returns the number of positive values among a, b and c;
    }

    public static void main(String[] args) {
        double a = 2, b = 3, c = 1;
        System.out.println(
                "(a, b, c,)=(" + a + ", " + b + ", " + c + "): hasTwoRoots? " +
                        hasTwoRoots(a, b, c)
        );
        a = 0;
        b = 2;
        c = 1;
        System.out.println(
                "(a, b, c,)=(" + a + ", " + b + ", " + c + "): hasTwoRoots? " +
                        hasTwoRoots(a, b, c)
        );

        a = 2;
        b = 1;
        c = -1;
        System.out.println(
                "(a, b, c,)=(" + a + ", " + b + ", " + c + "): monot? " +
                        monot(a, b, c)
        );
        a = 2;
        b = 1;
        c = 2;
        System.out.println(
                "(a, b, c,)=(" + a + ", " + b + ", " + c + "): monot? " +
                        monot(a, b, c)
        );

        a = 2;
        b = 1;
        c = 2;
        System.out.println(
                "(a, b, c,)=(" + a + ", " + b + ", " + c + "): maxEl = " +
                        maxEl(a, b, c)
        );

        a = 2;
        b = 2;
        c = 4;
        System.out.println(
                "(a, b, c,)=(" + a + ", " + b + ", " + c + "): maxEl = " +
                        maxEl(a, b, c)
        );

        a = -2;
        b = 1;
        c = -3;
        System.out.println(
                "(a, b, c,)=(" + a + ", " + b + ", " + c + "): numPos = " +
                        numPos(a, b, c)
        );
        a = -2;
        b = 1;
        c = 3;
        System.out.println(
                "(a, b, c,)=(" + a + ", " + b + ", " + c + "): numPos = " +
                        numPos(a, b, c)
        );
    }
}