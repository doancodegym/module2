import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int i = 0;
        while (i < array.length){
            System.out.println("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for(int j = 0;j < array.length/2;j++){
            int temp;
            temp = array[j];
            array[j] = array[10-1-j];
            array[10-1-j] = temp;
        }
        System.out.printf("%-20s%s", "Reverse array: ","");
        for(int j = 0;j < array.length;j++){
            System.out.print(array[j]+"\t");
        }

    }
}
