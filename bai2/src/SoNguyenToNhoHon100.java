import java.util.Scanner;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        System.out.println("Số nguyên tố nhỏ hơn 100 : ");

        for ( int n = 2;n<100;n++){
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(n)){
                if(n % i == 0){
                    check = false;
                    break;
                }else {
                    i++;
                }
            }
            if(check){
                System.out.println(n);
            }

        }
    }
}
