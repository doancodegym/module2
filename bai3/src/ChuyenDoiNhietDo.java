import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        double c;
        double f;
        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter choice :");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter F : ");
                    f = scanner.nextDouble();
                    System.out.println("F to C : "+fToC(f));
                    break;
                case 2:
                    System.out.println("Enter C : ");
                    c = scanner.nextDouble();
                    System.out.println("C to F : "+cToF(c));
                    break;
                case 3:
                    System.exit(0);
            }
        }while (choice!=0);
    }
    public static double cToF(double c){
        double f = (9.0/5)*c+32;
        return f;
    }
    public static double fToC(double f){
        double c = (5.0/9)*(f-32);
        return c;
    }
}
