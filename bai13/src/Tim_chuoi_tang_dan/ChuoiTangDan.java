package Tim_chuoi_tang_dan;

import java.util.LinkedList;
import java.util.Scanner;

public class ChuoiTangDan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần tìm độ dài : ");
        String string = input.nextLine();
        LinkedList<Character> list = new LinkedList();
        for (int i = 0;i < string.length();i++){
            if (list.size()<=0 ||string.charAt(i) > list.getLast()){
                list.add(string.charAt(i));
            }else {
                continue;
            }
        }
        System.out.print("Chuỗi liên tiếp có độ dài tăng dần là : ");
        for (Character max:list) {
            System.out.print(max);
        }
    }
}
