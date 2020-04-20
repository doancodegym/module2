package fizzbuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    @DisplayName("Test Fizz")
    void getFizzBuzz() {
        FizzBuzz.number = 21;
        String check = "Fizz";
        assertEquals(check,FizzBuzz.getFizzBuzz());
    }
    @Test
    @DisplayName("Test Buzz")
    void getFizzBuzz1() {
        FizzBuzz.number = 40;
        String check = "Buzz";
        assertEquals(check,FizzBuzz.getFizzBuzz());
    }
    @Test
    @DisplayName("Test FizzBuzz")
    void getFizzBuzz2() {
        FizzBuzz.number = 30;
        String check = "FizzBuzz";
        assertEquals(check,FizzBuzz.getFizzBuzz());
    }
    @Test
    @DisplayName("Test No FizzBuzz")
    void getFizzBuzz3() {
        FizzBuzz.number = 89;
        String check = Integer.toString(FizzBuzz.number);
        assertEquals(check,FizzBuzz.getFizzBuzz());
    }
}