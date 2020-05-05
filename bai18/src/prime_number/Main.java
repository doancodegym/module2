package prime_number;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LazyPrimeFactorization num = new LazyPrimeFactorization();

        Thread thread = new Thread(num){
            public void run(){
                num.run(100);
            }
        };
        Thread thread1 = new Thread(num){
            public void run(){
                num.run(100);
            }
        };
        thread.start();
        thread.join();
        thread1.start();
    }

}
