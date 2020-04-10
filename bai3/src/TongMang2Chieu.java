import java.util.Arrays;
import java.util.Scanner;

public class TongMang2Chieu {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Nhập số cột :");
        int a = input.nextInt();
        System.out.println("Nhập số hàng :");
        int b = input.nextInt();
        int[][] number = new int [a][b];
        for(int i = 0;i < number.length;i++){
            for(int j = 0;j<number[0].length;j++){
                System.out.printf("Nhập giá trị vị trí hàng %d,cột %d : ",i+1,j+1 );
                number[i][j]=input.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập là :");
        for(int i = 0;i<number.length;i++){
            System.out.println(Arrays.toString(number[i]));
        }
        int sum = 0;
        System.out.println("Nhập cột muốn tính tổng :");
        int cols = input.nextInt();
        for(int i = 0;i < number[cols].length;i++){
            sum += number[cols][i];
        }
        System.out.printf("Tổng giá trị của cột %d là %d",cols,sum);
    }
}
