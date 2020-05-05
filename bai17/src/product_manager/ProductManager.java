package product_manager;

import java.io.*;
import java.util.ArrayList;

public class ProductManager extends Product {
    public static void main(String[] args) throws IOException {
        ArrayList<Product> list = new ArrayList<>();
        Product product = new Product();
        InputStream inputStream = null;
        try{
            inputStream = new FileInputStream("C:\\Codegym\\module2\\bai17\\src\\product_manager\\product_list.txt");
            BufferedInputStream bufferedReader = new BufferedInputStream(inputStream);
            byte[] buffer = new byte[1024];
            String line;
            String input = new String(buffer,0,bufferedReader.read(buffer));
            String[] listProduct = input.split(",");
            product.add(listProduct);
            System.out.println(product.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
        }
    }
}
