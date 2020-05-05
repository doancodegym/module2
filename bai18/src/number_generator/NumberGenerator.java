package number_generator;

public class NumberGenerator implements Runnable {

    public void run(int n) {
       synchronized (this){
           for(int i = 0;i < 10;i++){
               System.out.println(i+n);
               try {
                   Thread.sleep(300);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       }

    }
    @Override
    public void run() {

    }
}
