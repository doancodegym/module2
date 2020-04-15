package triangle;

public class Triangle extends Shape{
    private double size1 = 1;
    private double size2 = 1;
    private double size3 = 1;

    Triangle(){
    }
    Triangle(double size1,double size2,double size3){
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }
    Triangle(String color,boolean filled,double size1,double size2,double size3){
        super(color, filled);
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }
    public double setPerimeter(){
        return this.size1+this.size2+this.size3;
    }
    public double setAH(){
        return setPerimeter()/2;
    }
    public double setArea (){
     return Math.sqrt(this.setAH()*(this.setAH()-this.size1)*(this.setAH()-this.size2)*(this.setAH()-this.size3));
    }
    public String toString(){
        return "Hình tam giác có chu vi là "+setPerimeter()
                + " và diện tích là "+setArea()
                + " với độ dài 3 cạnh là "+getSize1()+","+getSize2()+","+getSize3()
                +"\n"+ super.toString();
    }
}
