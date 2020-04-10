import java.lang.reflect.Array;
import java.util.Arrays;

public class GanPTVaoMang {
    public static void main(String[] args) {
        int[] num1 = {43,5,64,7,5,23};
        int[] num2 = {6,86,3,22,6};
        int[] num3 = new int[11];
        for(int i = 0;i<num1.length;i++){
            num3[i] = num1[i];
        }
        for(int i= 0;i<num2.length;i++){
            num3[num1.length+i] = num2[i];
        }
        System.out.print("Mảng thứ nhất là : ");
        System.out.print(Arrays.toString(num1));
        System.out.println("");
        System.out.print("Mảng thứ hai là : ");
        System.out.print(Arrays.toString(num2));
        System.out.println("");
        System.out.print("Mảng sau khi gộp là : ");
        System.out.print(Arrays.toString(num3));
    }
}
