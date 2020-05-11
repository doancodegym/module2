
package crawl;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.InflaterInputStream;

public class CrawlGirl {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://hinhanhdephd.com/bo-suu-tap-girl-xinh-1998-thu-hut-moi-anh-nhin");

            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();

            content.replaceAll("\\n","");
            Pattern pattern1 = Pattern.compile("");
            Pattern pattern = Pattern.compile("src=\"(.*?)\" alt=\"anh-girl-xinh-1998");
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()){
                System.out.println(matcher.group(1));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

