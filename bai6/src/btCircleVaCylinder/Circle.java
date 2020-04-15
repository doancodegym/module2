package btCircleVaCylinder;

public class Circle {
    private double radius = 1;
    private String color = "red";

    Circle(){
    }

    Circle(double radius,String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double setPerimeter(){
        return 2*radius*Math.PI;
    }
    public double setArea(){
        return radius*radius*Math.PI;
    }
    public String toString(){
        return "A Circle has perimeter "
                +setPerimeter()
                +" and area "+setArea()
                +" with color of "
                +getColor()
                +" and radius "
                +getRadius();
    }
}
