package book;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class RunBook {
    public static void main(String[] args) throws FileNotFoundException {
        Book[] listbook = new Book[10];
        listbook[0] = new ProgrammingBook("Cô gái đến từ hôm qua","Nguyễn Nhật Ánh",30000,1,"Tiếng Việt","No");
        listbook[1] = new FictionBook("Thiếu niên không thể quay lại ấy", "Đòng Hoa", 45000, 2, "Tâm lý,tình cảm");
        listbook[2] = new FictionBook("Tủ sách chồi non", "Lê Tất Điều,Lý Lan", 20000, 3, "Thiếu nhi");
        listbook[3] = new ProgrammingBook("Ngôi nà nhỏ trên thảo nguyên", "Laura Ingalls Wilder", 60000, 4, "java", "No");
        listbook[4] = new FictionBook("Thám tử lừng danh Conan", "Aoyama Gosho", 25000, 5, "Thiếu nhi,Trinh thám");
        listbook[5] = new ProgrammingBook("Những nguyên tắc sống", "Jack Canfield", 30000, 6, "java", "No");
        listbook[6] = new ProgrammingBook("Dám nghĩ lớn", "David Schwartz", 70000, 7, "Tiếng Anh", "No");
        listbook[7] = new ProgrammingBook("One Piece", "Oda Eiichiro", 25000, 8, "java", "No");
        listbook[8] = new ProgrammingBook("Đắc nhân tâm", "Dale Carnegie", 80000, 9, "java", "No");
        listbook[9] = new FictionBook("Bắt trẻ đồng xanh", "J.D.Salinger", 35000, 10, "Văn học");
        int money = 0;
        for (int i = 0; i < listbook.length; i++) {
            System.out.println(listbook[i].toString());
            money += listbook[i].getPrice();
        }
        System.out.println("Tổng tiền 10 cuốn sách là : " + money + " VND");
        System.out.println("Số cuốn sách viết bằng ngôn ngữ java là " + ProgrammingBook.count);


    }
}
