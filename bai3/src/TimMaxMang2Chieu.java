import java.util.Arrays;

public class TimMaxMang2Chieu {
    public static void main(String[] args) {
        double[][] number = {
                {64, 635, 98, 54, 76},
                {56, -334, 6, 342, 96},
                {3, 65, 34,-75, 234},
                {34, -76, 87, 2, 676},
                {656, 79, 45, -99, 34}
        };
        double max = number[0][0];
        for(int i = 0;i<number.length;i++){
            for(int j = 0;j < number.length;j++){
                if(number[i][j] > max){
                    max = number[i][j];
                }
            }
        }
        System.out.println("Mảng hai chiều : ");
        System.out.println(Arrays.toString(number[0]));
        System.out.println(Arrays.toString(number[1]));
        System.out.println(Arrays.toString(number[2]));
        System.out.println(Arrays.toString(number[3]));
        System.out.println(Arrays.toString(number[4]));
        System.out.println("");
        System.out.print("Giá trị lớn nhất trong mảng là : ");
        System.out.print(max);
    }
}
