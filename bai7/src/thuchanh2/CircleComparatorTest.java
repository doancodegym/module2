package thuchanh2;
import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest{
    public static void main(String[] args) {
        Circle[] circles = new Circle[2];
        circles[0] = new Circle(3);
        circles[1] = new Circle(1);
        System.out.println("Fist : ");
        for (Circle circle:circles) {
            System.out.println(circle);
        }
        Comparator comparator = new CircleComparator();
        Arrays.sort(circles,comparator);
        System.out.println("Last : ");
        for (Circle circle:circles){
            System.out.println(circle);
        }
    }
}
