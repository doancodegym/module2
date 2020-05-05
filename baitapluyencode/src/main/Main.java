package main;

import controller.ProductManager;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ProductManager product =  new ProductManager();
        File fileProduct = new File("C:\\Codegym\\module2\\baitapluyencode\\src\\storage\\list.txt");
        FileReader fileReader = new FileReader(fileProduct);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        while ((line = bufferedReader.readLine())!= null){
            String[] list = line.split(",");
            product.addProduct(list);
        }
        product.ShowInfo();
        System.out.println("\n\nSau khi chỉnh sửa và sắp xếp !!!!!!\n\n");
        product.delete("Sữa");
        product.edit(1,"kem",2,5000,"Còn hàng","Kem thơm ngon mát lạnh");
        product.soft(true);

    }
}