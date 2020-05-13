package account;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AccountUser {
    final static String FILE = "C:\\Codegym\\module2\\baitapluyencode\\src\\account\\account.txt";
    public static boolean pull(String ID,String pass) throws IOException {
        File fileProduct = new File(FILE);
        FileReader fileReader = new FileReader(fileProduct);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        while ((line = bufferedReader.readLine())!= null){
            String[] list = line.split("_");
            if(list[0].equals(ID) && list[1].equals(pass)){
                return true;
            }
        }
        fileReader.close();
        return false;
    }

}
