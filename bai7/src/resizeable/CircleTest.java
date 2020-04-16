package resizeable;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle circle = new Circle();

        System.out.println(circle);
        System.out.print("Diện tích là : " + circle.getArea()+"\n");
        System.out.println("Nhập phầm trăm diện tích muốn tăng lên :");
        double percent = input.nextDouble();
        System.out.print("Diện tích sau khi tăng là : " + circle.resize(percent)+"\n----------------------\n");

        circle = new Circle(3.5);
        System.out.println(circle);
        System.out.print("Diện tích là : " + circle.getArea()+"\n");
        System.out.println("Nhập phầm trăm diện tích muốn tăng lên :");
        percent = input.nextDouble();
        System.out.print("Diện tích sau khi tăng là : " + circle.resize(percent)+"\n----------------------\n");

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
        System.out.print("Diện tích là : " + circle.getArea()+"\n");
        System.out.println("Nhập phầm trăm diện tích muốn tăng lên :");
        percent = input.nextDouble();
        System.out.print("Diện tích sau khi tăng là : " + circle.resize(percent)+"\n");
    }
}
