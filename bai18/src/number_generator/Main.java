package number_generator;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();

        Thread thread1 = new Thread(numberGenerator){
            public void run(){
                numberGenerator.run(0);
            }
        };
        Thread thread2 = new Thread(numberGenerator){
            public void run(){
                numberGenerator.run(10);
            }
        };
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();
    }

}
