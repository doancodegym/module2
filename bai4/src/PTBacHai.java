import java.util.Scanner;

public class PTBacHai {
    public static void main(String[] args) {
        double a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A :");
        a = input.nextDouble();
        System.out.println("Enter B :");
        b = input.nextDouble();
        System.out.println("Enter C :");
        c = input.nextDouble();
        QuadraticEquation PTbachai = new QuadraticEquation(a,b,c);

        if(PTbachai.getDiscriminant()>0){
            System.out.println("The equation has two root "+PTbachai.getRoot1() + " and "+PTbachai.getRoot2());
        }else if(PTbachai.getDiscriminant()== 0){
            System.out.println("The equation has two root "+PTbachai.getRoot1());
        }else {
            System.out.println("The equation has no roots");
        }
    }

    public static class QuadraticEquation{
        double a,b,c;
        public QuadraticEquation(){
        }
        private QuadraticEquation(double a,double b,double c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        private double getA(){
            return this.a;
        }
        private double getB(){
            return this.b;
        }
       private double getC(){
            return this.c;
        }
       private double getDiscriminant(){
            double delta = b*b-4*a*c;
            return delta;
        }
        private double getRoot1(){
            double r1 = (-b+Math.sqrt(b*b-4*a*c))/(a*a);
            return r1;
        }
        private double getRoot2(){
            double r2 = (-b-Math.sqrt(b*b-4*a*c))/(a*a);
            return r2;
        }
    }
}
