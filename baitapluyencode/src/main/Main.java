package main;

import account.AccountUser;
import controller.Manager;

import java.io.*;
import java.util.Scanner;

public class Main {
    static Manager vocabulary =  new Manager();
    static Scanner input = new Scanner(System.in);
    final static String FILE = "C:\\Codegym\\module2\\baitapluyencode\\src\\storage\\list.txt";
    public static void pull() throws IOException {
        File fileVocabulary = new File(FILE);
        FileReader fileReader = new FileReader(fileVocabulary);

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        while ((line = bufferedReader.readLine())!= null){
            String[] list = line.split("_");
            vocabulary.addVocabulary(list);
        }
        fileReader.close();
    }

    public static void menuAdmin(){
        System.out.println("Tùy chọn chức năng !!!\n" +
                "1.Danh sách từ vựng\n" +
                "2.Tìm kiếm\n" +
                "3.Thêm từ vựng\n" +
                "4.Sửa từ vựng\n"+
                "5.Xóa từ vựng\n" +
                "6.Thoát");
    } public static void menuMember(){
        System.out.println("Tùy chọn chức năng !!!\n" +
                "1.Danh sách từ vựng\n" +
                "2.Tìm kiếm\n" +
                "3.Thoát");
    }
    public static void start() throws IOException {

        System.out.println("Tùy chọn quyền truy cập :\n" +
                "1.Admin\n" +
                "2.Thành viên\n" +
                "3.Thoát");
        int num = input.nextInt();
        switch (num){
            case 1:
                int numx = -1;
                while (numx != 0){
                    System.out.println("Nhập mạt khẩu :");
                    int pass = input.nextInt();
                    if(pass == 123456) {
                        admin();
                    }else {
                        System.out.println("Sai mật khẩu !");
                    }
                }
            case 2:
                int numy = -1;
                while (numy != 0){
                    System.out.println("Nhập tài khoản:");
                    String ID = input.next();
//                    ID = input.nextLine();
                    System.out.println("Nhập mạt khẩu :");
                    String pass = input.next();
                    if(AccountUser.pull(ID,pass)) {
                        member();
                    }else {
                        System.out.println("Sai tài khoản hoặc mật khẩu !");
                    }
                }
            case 3:
                System.out.println("Logout....!");
                System.exit(-1);
        }
    }
    public static void admin() {
        int chooie = -1;
        while (chooie != 0) {
            menuAdmin();
            int select = input.nextInt();
            switch (select) {
                case 1:
                    vocabulary.ShowInfo();
                    break;
                case 2:
                    System.out.println("Nhập từ vựng : ");
                    String nameSearch = input.nextLine();
                    nameSearch = input.nextLine();
                    vocabulary.search(nameSearch);
                    break;
                case 3:
                    System.out.println("Nhập từ vựng :");
                    String vocabulary = input.nextLine();
                    vocabulary = input.nextLine();
                    System.out.println("Kiểu :");
                    String type = input.nextLine();
                    System.out.println("Dịch nghĩa:");
                    String translate = input.nextLine();
                    System.out.println("Link phát âm:");
                    String link = input.nextLine();
                    System.out.println("Ví dự :");
                    String example = input.nextLine();
                    System.out.println("Ví dụ dịch:");
                    String exampleVN = input.nextLine();
                    String[] newVocabulary = {vocabulary, type, translate, link, example, exampleVN};
                    Main.vocabulary.addVocabulary(newVocabulary);
                    break;
                case 4:
                    System.out.println("Nhập từ muốn chỉnh sửa : ");
                    String nameEdit = input.nextLine();
                    nameEdit = input.nextLine();
                    System.out.println("Nhập từ mới : ");
                    String newName = input.nextLine();
                    System.out.println("Kiểu :");
                    String newType = input.nextLine();
                    System.out.println("Dịch nghĩa : ");
                    String newTranslate = input.nextLine();
                    System.out.println("Link phát âm : ");
                    String newLink = input.nextLine();
                    System.out.println("Ví dụ : ");
                    String newExample = input.nextLine();
                    System.out.println("Dịch nghĩa ví dụ : ");
                    String newExampleVn = input.nextLine();
                    Main.vocabulary.edit(nameEdit, newName, newType, newTranslate, newLink, newExample, newExampleVn);
                    break;
                case 5:
                    System.out.println("Nhập từ muốn xóa :");
                    String delName = input.nextLine();
                    delName = input.nextLine();
                    Main.vocabulary.delete(delName);
                    System.out.println("Đã xóa từ " + delName);
                    break;
                case 6:
                    int check;
                    System.out.println("===========\n\n" +
                            "1.Thoát và lưu\n" +
                            "2.Thoát");
                    check = input.nextInt();
                    switch (check){
                        case 1:
                            try {
                                Main.vocabulary.push();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Logout....!");
                            System.exit(-1);
                        case 2:
                            System.exit(-1);
                    }

                default:
                    System.out.println("Không hợp lệ !!!");

            }
        }
    }
    public static void member() throws IOException {
        int select = -1;
        while (select !=0) {
            menuMember();
            int value = input.nextInt();
            switch (value) {
                case 1:
                    vocabulary.readFileMember();
                    break;
                case 2:
                    System.out.println("Nhập từ vựng : ");
                    String nameSearch = input.next();
                    vocabulary.search(nameSearch);
                    break;
                case 3:
                    System.out.println("Logout....!");
                    System.exit(-1);
                default:
                    System.out.println("Không hợp lệ !!!");
            }
        }
    }
}