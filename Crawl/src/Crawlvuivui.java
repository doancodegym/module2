import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawlvuivui {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("test.txt");
        URL url = new URL("https://fptshop.com.vn/dien-thoai/apple-iphone");

        Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
        scanner.useDelimiter("\\Z");
        String content = scanner.next();
        content = content.replaceAll("\\n+","");
        Pattern pattern =  Pattern.compile("Home'(.*?)',(.*?),(.*?),0000,''");
        Matcher matcher = pattern.matcher(content);

//        Pattern p = Pattern.compile("<strong>(.*?)</strong>");
//        Matcher m = p.matcher(content);
        while (matcher.find()){
            System.out.println(matcher.group(1));
            fileWriter.write(matcher.group(1)+",");
            fileWriter.write(matcher.group(2)+",");
            fileWriter.write(matcher.group(3)+"\n");
            fileWriter.flush();
//            fileWriter.write(m.group(1)+"\n");

        }
        fileWriter.close();
    }
}
