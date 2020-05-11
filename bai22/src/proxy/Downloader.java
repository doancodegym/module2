package proxy;

import java.io.IOException;
import java.net.MalformedURLException;

public interface Downloader {
    public void download(String url,String destination) throws MalformedURLException, IOException;
}
