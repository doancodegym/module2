package cleancode_method;

public class Cylinder {
    public static double getArea(int radius){
        double baseArea = Math.PI * radius * radius;
        return baseArea;
    }
    public static double getPerimeter(int radius){
        double perimeter = 2 * Math.PI  * radius;
        return perimeter;
    }
    public static double getVolume(int radius, int height){
        double volume = getPerimeter(radius) * height + 2 * getArea(radius);
        return volume;
    }
}