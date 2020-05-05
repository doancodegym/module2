package even_odd;

public class Even_Odd implements Runnable {
    @Override
    public void run() {
        for (int i = 1;i < 10;i++){
           if(i % 2 == 0){
               System.out.println(i);
           }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void run2() {
        for (int i = 0;i < 10;i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
