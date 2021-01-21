package Task21_3;

public class Square {
    private double side;

    public Square(double s) {
        this.side = s;
    }

    public Square() {
        this.side = 1;
    }


    @Override
    public String toString() {
        return "Square[" + this.side + "]";
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    public double getPerimeter() {
        return this.side * 4;
    }

    public double getDiagonal() {
        return this.side * Math.sqrt(2);
    }

    public Circle getInscribedCircle() {
        return new Circle(side * 2);
    }

    public Circle getCircumscribedCircle() {
        return new Circle(getDiagonal() / 2);
    }

    public Square(Circle circle) {
        this.side = Math.sqrt(circle.getArea());
    }
}
