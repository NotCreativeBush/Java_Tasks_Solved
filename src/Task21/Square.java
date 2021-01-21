package Task21;



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

    public double getDiagonal() {
        return this.side * Math.sqrt(2);
    }

    public double getPerimeter() {
        return this.side * 4;
    }

    public Square getDoubled() {
        return new Square(this.side * 2);
    }

    public static double getTotalArea(Square[] sqs) {
        double sum = 0;
        for (Square x : sqs) {
            sum += x.getArea();
        }
        return sum;
    }

    public static Square getMax(Square[] sqs) {
        Square ma = sqs[0];
        for (int i = 1; i < sqs.length; i++) {
            if (ma.getSide() < sqs[i].getSide()) {
                ma = sqs[i];
            }
        }
        return ma;
    }
    public Circle getInscribedCircle(){
        return new Circle(side*2);
    }
    public Circle getCircumscribedCircle(){
        return new Circle(getDiagonal()/2);
    }
    public Square(Circle circle){
        this.side=Math.sqrt(circle.getArea());
    }
}
