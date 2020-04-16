package thuchanh2;

public class Circle extends Shape {
    private double radius = 1;

    Circle(){
    }
    Circle(double radius){
        this.radius = radius;
    }
    Circle(String color,boolean filled,double radius){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double setArea(){
        return this.radius*this.radius*Math.PI;
    }
    public double setPerimeter(){
        return this.radius * 2 * Math.PI;
    }
    public String toString(){
        return "A Circle with radius="+this.getRadius()+", which is a subclass of "+super.toString();
    }
}