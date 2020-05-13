package storage;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawl {
    public static void pushTxt() throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\Codegym\\module2\\baitapluyencode\\src\\storage\\list.txt");
        try {
            for (int i = 1;i <= 18;i++){
                String link = "http://tienganhtflat.com/blog/tu-vung-ielts-phan-" + i;
                URL url = new URL(link);

                //Mở stream và đưa nó vào InputStreamReader
                Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
                scanner.useDelimiter("\\Z");
                String content = scanner.next();
                scanner.close();

                //Xóa tất cả new line trong content lấy được
                content.replaceAll("\\n+","");
                //Lọc nội dung cần lấy
                Pattern p = Pattern.compile("lide-content-header\">(.*?) <span>(.*?)</span></div><div class=\"slide-content-body\"><p><b class=\"means\">(.*?)</b><br/><a class=\"audio-link\" href=\"(.*?)\"><span class=\"span-audio\"><span class=\"btn-audio fa fa-play-circle\"></span></span></a>(.*?)</p><p><b>Ex:</b>(.*?)<br/><i>(.*?)</i></p></div>");
                Matcher m = p.matcher(content);
                while (m.find()) {
                    fileWriter.write(m.group(1)+"_");
                    fileWriter.write(m.group(2)+"_");
                    fileWriter.write(m.group(3)+"_");
                    fileWriter.write(m.group(4)+"_");
                    fileWriter.write(m.group(6)+"_");
                    fileWriter.write(m.group(7)+"\n");
                    fileWriter.flush();
                }
            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
