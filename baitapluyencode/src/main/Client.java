package main;

import storage.Crawl;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        Crawl.pushTxt();
        Main.pull();
        Main.start();
    }
}
