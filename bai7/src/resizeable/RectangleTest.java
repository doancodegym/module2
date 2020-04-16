package resizeable;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        System.out.print("Diện tích là : " + rectangle.getArea()+"\n");
        System.out.println("Nhập phầm trăm diện tích muốn tăng lên :");
        double percent = input.nextDouble();
        System.out.print("Diện tích sau khi tăng là : " + rectangle.resize(percent)+"\n----------------------\n");

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);
        System.out.print("Diện tích là : " + rectangle.getArea()+"\n");
        System.out.println("Nhập phầm trăm diện tích muốn tăng lên :");
        percent = input.nextDouble();
        System.out.print("Diện tích sau khi tăng là : " + rectangle.resize(percent)+"\n----------------------\n");

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
        System.out.print("Diện tích là : " + rectangle.getArea()+"\n");
        System.out.println("Nhập phầm trăm diện tích muốn tăng lên :");
        percent = input.nextDouble();
        System.out.print("Diện tích sau khi tăng là : " + rectangle.resize(percent)+"\n----------------------\n");

    }
}
