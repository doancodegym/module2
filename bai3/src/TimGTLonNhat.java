import java.lang.reflect.Array;
import java.util.Scanner;

public class TimGTLonNhat {
    public static void main(String[] args) {
        int[] number;
        number = new int[10];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(i < number.length){
            System.out.println("Enter element "+(i+1)+":");
            number[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Property list: ");
        for (int j = 0;j<number.length;j++){
            System.out.print(number[j]+"\t");
        }
        int max = number[0];
        for (int j =0;j<number.length;j++){
            if(number[j]>max){
                max = number[j];
            }
        }
        System.out.println("Value max : "+max);
    }
}
