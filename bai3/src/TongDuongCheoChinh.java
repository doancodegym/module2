import java.util.Arrays;
import java.util.Scanner;

public class TongDuongCheoChinh {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Nhập số cột và hàng ma trận vuông :");
        int a = input.nextInt();
        int[][] number = new int [a][a];
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
        for(int i = 0;i<number.length;i++){
            sum += number[i][i];
        }
        System.out.printf("Tổng giá trị đường chéo chính là %d",sum);
    }
}
