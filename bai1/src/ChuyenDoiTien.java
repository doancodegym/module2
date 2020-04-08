import java.util.Scanner;

public class ChuyenDoiTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị USD : ");
        int usd = scanner.nextInt();
        int vnd = usd*23000;
        System.out.println(usd +" USD Có giá tương đương "+vnd+" VND");
    }
}
