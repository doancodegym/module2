import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] student = {"Đông","Đăng","Hiếu","Huân","Dân","Trung","Long"};
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a name student :");
        String name = scanner.nextLine();
        boolean isExits = false;
        for (int i = 0;i < student.length;i++){
            if (student[i].equals(name)){
                System.out.println("Position of the students in the list " + name + " is: " + (i + 1));
                isExits = true;
                break;
            }else {
                System.out.println("Not found " + name + " in the list.");
                break;
            }
        }
    }
}
