package Task21;



public class Circle {
    private double radius;

    public Circle(double s) {
        this.radius = s;
    }

    public Circle() {
        this.radius = 1;
    }


    @Override
    public String toString() {
        return "Circle[" + this.radius + "]";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public Square getInscribedSquare() {
        return new Square((radius * 2) / Math.sqrt(2));
    }

    public Square getCircumscribedSquare() {
        return new Square(radius * 2);
    }

    public Circle(Square square) {
        this.radius = Math.sqrt(square.getArea()) / Math.PI;
    }

    public static Square[] getSquares(Circle[] arr) {
        Square[] ans = new Square[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = new Square(arr[i]);
        }
        return ans;
    }
}
