package illegal_triangle_exception_assignment;

import java.util.Scanner;

public class IllegalTriangleExceptionAssignment {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Nhập độ dài cạnh thứ 1 : ");
            int canh1 = input.nextInt();
            System.out.println("Nhập độ dài cạnh thứ 2 : ");
            int canh2 = input.nextInt();
            System.out.println("Nhập độ dài cạnh thứ 3 : ");
            int canh3 = input.nextInt();

            if (canh1 < 0 || canh2 < 0 || canh3 < 0 || canh1 + canh2 < canh3 || canh2 + canh3 < canh1 || canh1 + canh3 < canh2) throw new Exception();
        }catch (Exception e){
            System.out.println("Lỗi");
        }
    }
}
