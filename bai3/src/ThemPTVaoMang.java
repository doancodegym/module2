import java.util.Arrays;
import java.util.Scanner;

public class ThemPTVaoMang {
    public static void main(String[] args) {
        int[] number = new int[10];
        number[0]=3;
        number[1]=5;
        number[2]=9;
        number[3]=6;
        int x = 8;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mảng trước khi chèn phần tử : ");
        System.out.print(Arrays.toString(number));
        System.out.println("");
        System.out.println("Nhập vị trí thêm phần tử : ");
        int position = scanner.nextInt();
        System.out.print("Mảng sau khi chèn phần tử : ");
        for(int i = number.length-1;i >= position;i--){
            number[i] =number[i-1];
        }
        number[position]=x;
        System.out.println(Arrays.toString(number));
    }
}
