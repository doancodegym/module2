package resizeable;

public class Circle extends Shape implements Resizeable{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Hình tròn có bán kính "
                + getRadius()
                + ",diện tích "+getArea()+", là hình "
                + super.toString();
    }
    public double resize(double percent){
        double sum = this.getArea();
        sum += getArea()/100*percent;
        return sum;
    }
}