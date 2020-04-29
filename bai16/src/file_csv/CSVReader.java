package file_csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public static void main(String[] args) throws FileNotFoundException {

        String csvFile = "C:/Codegym/module2/bai16/src/file_csv/test1.csv";
        FileReader fileReader = new FileReader(csvFile);
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ";";

        try {

            br = new BufferedReader(fileReader);
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);

                System.out.println("Country [code= " + country[0] + " , name=" + country[1] + "]");

            }

        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại !");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}