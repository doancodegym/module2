package btCircleVaCylinder;

public class Cylinder extends Circle{
    private double height = 5;

    Cylinder(){
    }
    Cylinder(double height){
        this.height  = height;
    }
    Cylinder(double radius,String color,double height){
        super(radius, color);
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public double setVolume(){
        return super.setArea()*this.height;
    }
    public String toString(){
        return "A Cylinder with volume "
                +setVolume()
                +" and height "+ getHeight()
                + " of, "
                +super.toString();
    }
}
