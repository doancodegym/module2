package sumtext;

import java.io.*;

public class Sum {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Codegym/module2/bai16/src/sumtext/number.txt");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String ch;
            int sum = 0;
            while ((ch = bufferedReader.readLine()) != null){
                System.out.println(ch);
                sum += Integer.parseInt(ch);
            }
            System.out.println("Tổng : "+sum);
        }catch (FileNotFoundException e){
            System.out.println("File không tồn tại !");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(bufferedReader != null){
                bufferedReader.close();
            }
        }
    }
}
