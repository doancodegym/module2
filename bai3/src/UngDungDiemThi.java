import java.util.Scanner;

public class UngDungDiemThi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int count = 0;
        do {
            System.out.println("Nhập số lượng điểm thi : ");
            size =input.nextInt();
            if(size > 30){
                System.out.println("Số lượng điểm không được quá 30 !");
            }
        }while (size>30);
        int[] point = new int[size];
        for(int i = 0;i < point.length;i++){
            System.out.println("Nhập điểm thi thứ "+i);
            point[i] = input.nextInt();
        }
        for (int j = 0 ; j < point.length;j++){
            if(point[j] >=5 && point[j] <= 10){
                count++;
            }
        }
        System.out.print("Số sinh viên đỗ là : "+count);
    }
}
