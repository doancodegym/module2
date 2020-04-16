package colorable;

public class Square extends Shape implements Colorable{
    private double side = 1;
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
        return this.side*this.side;
    }
    public double getPerimeter(){
        return this.side*4;
    }
    @Override
    public String toString() {
        return "Hình vuông có kích thước cạnh là "
                + getSide()+
                " ,chu vi là "+getPerimeter()+
                " ,diện tích là "+getArea()
                + " , "
                + super.toString();
    }
    public void howToColor(){
        System.out.println("Color all four sides...");
    }
}