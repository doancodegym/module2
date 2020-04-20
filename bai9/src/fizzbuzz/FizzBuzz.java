package fizzbuzz;

public class FizzBuzz {
    public static int number;
    public static String getFizzBuzz(){

        boolean Fizz = number % 3 == 0;
        boolean Buzz = number % 5 == 0;
        boolean FizzBuzz = number % 5 == 0 && number % 3 == 0;
        if (FizzBuzz){
            return "FizzBuzz";
        } else {
            if(Fizz){
                return "Fizz";
            }else if(Buzz){
                return "Buzz";
            }else{
                return Integer.toString(number);
            }
        }
    }
}
