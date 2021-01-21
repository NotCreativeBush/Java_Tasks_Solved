package Task19;

public class Task19_03 {
    public static void main(String[] args) {
        Square square1 = new Square(13.0);
        Square square2 = new Square(14.0);
        Square square3 = Square.funny(square1, square2);
        System.out.println(square3.getLen());
    }
}
