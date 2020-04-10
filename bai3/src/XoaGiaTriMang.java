import java.util.Arrays;

public class XoaGiaTriMang {
    public static void main(String[] args) {
        int[] number = {12,3,6,7,5,8,0,0};
        int x = 5;
        int y = 0;
        for(int i = 0;i < number.length;i++){
            if(number[i]==x){ 
                y = i;
            }
        }
        for(int i = y;i < number.length-1;i++){
            number[i]=number[i+1];
        }
        System.out.print(Arrays.toString(number));

    }
}
