package proxy;

import java.io.IOException;

public class FileDownloaderProxy implements Downloader{
    final String userAgent = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) coc_coc_browser/86.0.170 Chrome/80.0.3987.170 Safari/537.36";
    FileDownloader fileDownloader = new FileDownloader(userAgent);
    @Override
    public void download(String url, String destination) throws IOException {
        fileDownloader.download(url,destination);

    }
}
