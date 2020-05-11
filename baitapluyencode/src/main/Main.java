package main;

import controller.Manager;
import storage.Crawl;

import java.io.*;
import java.util.Scanner;

public class Main {

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
    public static void main(String[] args) throws IOException {
        Crawl.pull();
        Scanner input = new Scanner(System.in);
        Manager product =  new Manager();
        File fileProduct = new File("C:\\Codegym\\module2\\baitapluyencode\\src\\storage\\list.txt");
        FileReader fileReader = new FileReader(fileProduct);

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        while ((line = bufferedReader.readLine())!= null){
            String[] list = line.split("_");
            product.addProduct(list);
        }
        fileReader.close();
        int chooie = -1;
        System.out.println("Tùy chọn quyền truy cập :\n" +
                "1.Admin\n" +
                "2.Thành viên\n" +
                "3.Thoát");
        int num = input.nextInt();
        switch (num){
            case 1:
                while (chooie !=0){
                    menuAdmin();
                    int select = input.nextInt();
                    switch (select){
                        case 1:
                            product.ShowInfo();
                            break;
                        case 2:
                            System.out.println("Nhập từ vựng : ");
                            String nameSearch = input.nextLine();
                            nameSearch = input.nextLine();
                            product.search(nameSearch);
                            break;
                        case 3:
                            System.out.println("Nhập từ vựng :");
                            String vocabulary = input.nextLine();
                            vocabulary = input.nextLine();
                            System.out.println("Kiểu :");
                            String type = input.nextLine();
                            System.out.println("Dịch nghĩa:");
                            String translate = input.nextLine();
                            String link = "none";
                            System.out.println("Ví dự :");
                            String example = input.nextLine();
                            String examplevn = "none";
                            String[] newVocabulary = {vocabulary,type,translate,link,example,examplevn};
                            product.addProduct(newVocabulary);
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
                            product.edit(nameEdit,newName,newType,newTranslate,newLink,newExample,newExampleVn);
                            break;
                        case 5:
                            System.out.println("Nhập từ muốn xóa :");
                            String delName = input.nextLine();
                            delName = input.nextLine();
                            product.delete(delName);
                            System.out.println("Đã xóa từ "+delName);
                            break;
                        case 6:
                            product.push();
                            System.out.println("Logout....!");
                            System.exit(-1);
                        default:
                            System.out.println("Không hợp lệ !!!");

                    }
                }
            case 2:
                while (chooie !=0) {
                    menuMember();
                    int select = input.nextInt();
                    switch (select) {
                        case 1:
                            product.ShowInfo();
                            break;
                        case 2:
                            System.out.println("Nhập từ vựng : ");
                            String nameSearch = input.next();
                            product.search(nameSearch);
                            break;
                        case 6:
                            product.push();
                            System.out.println("Logout....!");
                            System.exit(-1);
                        default:
                            System.out.println("Không hợp lệ !!!");
                    }
                }
            case 3:
                System.out.println("Logout....!");
                System.exit(-1);
        }
    }
}