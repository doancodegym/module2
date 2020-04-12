import java.util.Scanner;

public class DemChuoiKiTu {
    public static void main(String[] args) {
        String str = "Welcome to CodeGym !";
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập kí tự muốn kiểm tra : ");
        char text = input.next().charAt(0);
        int count = 0;
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) == text){
                count++;
            }
        }
        if(count == 0){
            System.out.printf("Kí tự %s không có trong chuỗi !",text);
        }
        else {
            System.out.printf("Kí tự %s xuất hiện %d lần trong chuỗi ",text,count);
        }
    }
}
