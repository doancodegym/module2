package thuchanh;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static  void copyFileUsingJava7Files(File source,File dest)throws IOException{
        Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStream(File source,File dest)throws IOException{
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try{
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0){
                outputStream.write(buffer,0,length);
                System.out.println();
            }
        }finally {
            inputStream.close();
            outputStream.close();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter source files : ");
        String sourcePath = input.nextLine();
        System.out.println("Enter dest files : ");
        String destPath = input.nextLine();

        File sourceFile =  new File(sourcePath);
        File destFile = new File(destPath);
        try {
            copyFileUsingStream(sourceFile, destFile);
            System.out.println("Size : "+destFile.length());
            System.out.println();
            System.out.printf("Copy completed");
        } catch (IOException ioe) {
            System.out.printf("Can't copy that file");
            System.out.printf(ioe.getMessage());
        }

    }
}
