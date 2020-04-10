import java.util.Scanner;

public class VeHinh {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();
        String paint = "";
        switch (choice){
            case 1:
                for(int i = 0;i <4;i++){
                    for (int j = 0 ;j <6;j++){
                        paint += "* ";
                    }
                    System.out.println(paint);
                    paint = "";
                }
                break;
            case 2:
                for(int i = 6;i >0;i--){
                    for (int j = 0 ;j <i;j++){
                        paint += "* ";
                    }
                    System.out.println(paint);
                    paint = "";
                }
                break;
            case 3:
                for(int i = 0;i <6;i++){
                    for (int j = 0 ;j <i;j++){
                        paint += "* ";
                    }
                    System.out.println(paint);
                    paint = "";
                }
                break;
            case 4:

        }
    }
}
