package resizeable;

public class Rectangle extends Shape implements Resizeable{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "Hình chữ nhật có chiều rộng "
                + getWidth()
                + ", chiều dài "
                + getLength()
                + ", là hình "
                + super.toString();
    }
    public double resize(double percent){
        double sum = this.getArea();
        sum += getArea()/100*percent;
        return sum;
    }
}