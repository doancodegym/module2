package thuchanh1;

public class test {
        static int count = 0;

        static void welcome() {
            count++;
            if (count <= 5) { // Phần cơ sở: Điều kiện thoát khỏi đệ quy
                System.out.println(count + ". Welcome to gpcoder.com ");
                welcome(); // Phần đệ quy: Thân hàm có chứa lời gọi đệ quy
            }
        }

        public static void main(String[] args) {
            welcome();
        }


}
