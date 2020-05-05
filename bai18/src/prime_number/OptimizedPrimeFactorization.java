package prime_number;

public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {

    }

    public void run(int n){
        System.out.println("OptimizedPrimeFactorization : ");
        for(int i = 2;i < n;i++){
            boolean check = true;
            int N = 2;
            while (N < Math.sqrt(i)) {
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
