import java.util.Scanner;

public class TimMin {
    public static void main(String[] args) {
        int[] min =new int[10];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i < min.length;i++){
            System.out.println("Enter element "+ (i+1) + " : ");
            min[i] = scanner.nextInt();
        }
        System.out.print("List value : ");
        for (int arraymin:min) {
            System.out.print(arraymin +" ");
        }
        System.out.println("\n");
        System.out.println("Min Value : " +minValue(min));
    }
    public static int minValue(int[]array){
        int min = array[0];
        for(int i = 0;i < array.length;i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
