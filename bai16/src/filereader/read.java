package filereader;

import java.io.*;

public class read {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            File file = new File("C:/Codegym/module2/bai16/src/filereader/test.txt");
            fileReader = new FileReader(file);
            fileWriter = new FileWriter("C:/Codegym/module2/bai16/src/filereader/test1.txt");
            System.out.println("Tên tập tin : " + file.getName() +"\n"+"Đường dẫn : "+ file.getPath());
            System.out.println("------ Nội dung ------");
            int ch;
           while (( ch = fileReader.read()) != -1){
               System.out.print((char)ch);
               fileWriter.write(ch);

           }
        }
        catch (FileNotFoundException e){
            System.out.println("Tệp tin không tồn tại !");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if(fileReader != null){
                fileReader.close();
            }
            if(fileWriter != null){
                fileWriter.close();
            }
        }
    }
}
