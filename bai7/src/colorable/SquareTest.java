package colorable;

public class SquareTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Square(3);
        shapes[1] = new Circle();
        shapes[2] = new Circle();
        shapes[3] = new Square(5);
        shapes[4] = new Square(8);
        for(int i = 0;i<shapes.length;i++) {
            System.out.println(shapes[i].toString());
            if (shapes[i] instanceof Square) {
                Square square = (Square) shapes[i];
                square.howToColor();
            }
            System.out.println("----------------");
        }
    }
}
