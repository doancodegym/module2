package proxy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader implements Downloader {
    protected String userAgent;
    final int BUFFER_SIZE =16384;

    public FileDownloader(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public void download(String url,String destination) throws IOException {

        URL downloadUrl = new URL(url);
        URLConnection connection = downloadUrl.openConnection();
        InputStream inputStream = connection.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream(destination);
        int bytesRead = -1;
        byte[] buffer = new byte[BUFFER_SIZE];
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            fileOutputStream.write(buffer, 0, bytesRead);
        }
        fileOutputStream.close();
        inputStream.close();
    }

}
