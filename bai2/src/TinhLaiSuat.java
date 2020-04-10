import java.util.Scanner;

public class TinhLaiSuat {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money : ");
        money = scanner.nextDouble();
        System.out.println("Enter month : ");
        month = scanner.nextInt();
        System.out.println("Enter interset rate : ");
        interset_rate = scanner.nextDouble();
        double total_inteset = money*(interset_rate/100)/12*money;
        System.out.println("Total intersset : "+ total_inteset);
    }
}
