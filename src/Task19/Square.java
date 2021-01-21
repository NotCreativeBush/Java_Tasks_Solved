package Task19;

public class Square {
    private double len;

    public Square(double len) {
        this.len = len;
    }

    public double getLen() {
        return len;
    }

    public static Square funny(Square s1, Square s2) {
        double sur1=s1.getLen()*s1.getLen();
        double sur2=s2.getLen()*s2.getLen();
        double len3=Math.sqrt(sur1+sur2);
        return new Square(len3);
    }
}
