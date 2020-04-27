package tim_chuoi_lien_tiep;

import java.util.LinkedList;
import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần tìm độ dài : ");
        String string = input.nextLine();
        LinkedList<Character> list = new LinkedList();
        for (int i = 0;i < string.length();i++){
            if (list.contains(string.charAt(i))){
                continue;
            }
            list.add(string.charAt(i));
        }
        System.out.print("Chuỗi liên tiếp có độ dài lớn nhất là : ");
        for (Character max:list) {
            System.out.print(max);
        }
    }
}
