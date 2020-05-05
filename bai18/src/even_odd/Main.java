package even_odd;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Even_Odd even_odd = new Even_Odd();

        Thread thread1 = new Thread(even_odd){
            public void run(){
                even_odd.run();
            }
        };
        Thread thread2 = new Thread(even_odd){
            public void run(){
                even_odd.run2();
            }
        };
       try {
           thread2.start();
           thread2.join();
           thread1.start();
       }catch (InterruptedException e){
           e.printStackTrace();

       }
    }
}
