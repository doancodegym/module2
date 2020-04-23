package kiemtrabieuthuc;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraBieuThuc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập biểu thức : ");
        String expression = input.nextLine();
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        char[] arr = expression.toCharArray();
        for (int i = 0;i < arr.length;i++){
            if(arr[i] == '('){
                stack1.push('(');
            }else if(arr[i] == ')'){
                stack2.push(')');
            }
        }
        boolean check = true;
        while (!stack1.isEmpty()){
            if (stack1.pop() != stack2.pop()){
                check = false;
            }
            check = true;
        }
        if (check && arr[0] != '('){
            System.out.println("Biểu thức đúng");
        }else {
            System.out.println("Biểu thức sai");
        }

    }
}
