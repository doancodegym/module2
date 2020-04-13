import java.util.Scanner;

public class RectAngle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Width :");
        double width = input.nextDouble();
        System.out.println("Enter heigth :");
        double height = input.nextDouble();
        display Rectangle = new display(width,height);
        System.out.println(Rectangle.display());
        System.out.println("Area Rectangle : ");
        System.out.println(Rectangle.getArea());
        System.out.println("Perimeter Rectangle :");
        System.out.println(Rectangle.getPerimeter());
    }
    public static class display{
        double width,heigth;
        public display(){
        }
        public display(double width,double heigth){
            this.width = width;
            this.heigth = heigth;
        }
        public double getArea(){
            return this.heigth*this.width;
        }
        public  double getPerimeter(){
            return (this.heigth+this.width)*2;
        }
        public String display(){
            return "Rectangle ( whidth:"+width+" , height: "+heigth+" )";
        }
    }
}

