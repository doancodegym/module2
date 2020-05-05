package prime_number;

public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {

    }
    public void run(int n){
        System.out.println("LazyPrimeFactorization : ");
        for(int i = 2;i < n;i++){
            boolean check = true;
            int N = 2;
            while (N < i) {
                if (i % N == 0) {
                    check = false;
                    break;
                }else {
                    N++;
                }
            }
            if (check) {
                System.out.println(i);
            }
        }
    }
}
