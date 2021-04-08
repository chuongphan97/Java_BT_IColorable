public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);

        System.out.println("Area of square: "+ square.getArea());
        if (!square.getColor().equals("")) square.howToColor();
    }
}
