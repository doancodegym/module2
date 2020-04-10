import java.util.Scanner;

public class In20SoNguyenTo {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number: ");
        number = scanner.nextInt();
        int count = 0;
        int n = 2;
        do {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(n)) {
                if (n%i == 0) {
                    check = false;
                    break;
                } else {
                    i++;
                }
            }
            if (check == true) {
                System.out.println(n);
                count++;
            }
            n++;
        }while (count<number);

    }
}
