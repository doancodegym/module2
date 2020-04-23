package palindrom;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrom {
    public static void main(String[] args) {
        Stack<String> palindrom1 = new Stack<>();
        palindrom1.push("A");
        palindrom1.push("b");
        palindrom1.push("l");
        palindrom1.push("e");
        palindrom1.push(" ");
        palindrom1.push("w");
        palindrom1.push("a");
        palindrom1.push("s");

        Queue<String> palindrom2 = new LinkedList<>();
        palindrom2.add("s");
        palindrom2.add("a");
        palindrom2.add("w");
        palindrom2.add(" ");
        palindrom2.add("e");
        palindrom2.add("l");
        palindrom2.add("b");
        palindrom2.add("A");

        boolean check = true;
        while (!palindrom1.isEmpty()){
            if(palindrom1.pop() != palindrom2.poll()){
                check = false;
            }
        }
        if (check){
            System.out.println("Đây là chuỗi palindrom !");
        }else {
            System.out.println("Không phải chuỗi palindrom !");
        }
        }
    }
