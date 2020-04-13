import java.util.Random;
import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomNumber = new Random();
        int n;
        System.out.println("Nhập độ dài chuỗi cần sắp xếp :");
        n = input.nextInt();
        long[] arr = new long[n];
        for(int i = 0;i< arr.length;i++){
            arr[i]=randomNumber.nextInt(n);
        }
        time StopWatch = new time();
        StopWatch.start();
        for(int i = 0;i<arr.length-1;i++){
            for(int j = i+1;j < arr.length;j++){
                long temp;
                temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        StopWatch.stop();
        System.out.println("Total time to process soft mechanic: " +StopWatch.getElapsedTime() +" ms");
    }

    private static class time{
        long startTime;
        long stopTime;
        private time() {

        }
        private time(long startTime,long stopTime){
            this.startTime =startTime;
            this.stopTime = stopTime;
        }
        private long getStartTime(){
            return this.startTime;
        }
        private long getStopTime(){
            return this.stopTime;
        }
        private void start(){
            this.startTime = System.currentTimeMillis();
        }
        private void stop(){
            this.stopTime = System.currentTimeMillis();
        }
        private long getElapsedTime(){
            return this.stopTime - this.startTime;
        }
    }
}
