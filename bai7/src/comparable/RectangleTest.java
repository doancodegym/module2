package comparable;

import resizeable.Rectangle;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        resizeable.Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        System.out.print("Diện tích là : " + rectangle.getArea() + "\n");

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);
        System.out.print("Diện tích là : " + rectangle.getArea() + "\n");

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
        System.out.print("Diện tích là : " + rectangle.getArea() + "\n");

    }
}