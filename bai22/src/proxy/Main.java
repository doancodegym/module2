package proxy;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        String url;
        String filePath;
        System.out.println("Nhập link và tên tệp (cách nhau khoảng trắng) :");
        //https://data25.chiasenhac.com/downloads/2080/1/2079467-cb64b655/320/Thich%20Thi%20Den%20-%20Le%20Bao%20Binh.mp3
        url=scn.next();
        filePath = scn.next();

        //src\proxy\text.mp3
        FileDownloaderProxy fileDownloaderProxy = new FileDownloaderProxy();
        fileDownloaderProxy.download(url,filePath);
    }
}
