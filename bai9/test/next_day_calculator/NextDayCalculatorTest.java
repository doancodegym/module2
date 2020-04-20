package next_day_calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    @DisplayName("Test the first day of months")
    void testFirstDayOfMonth() {
        NextDayCalculator.setDay(1);
        NextDayCalculator.setMonth(1);
        NextDayCalculator.setYear(2000);
        int expectedDay = 2;
        int expectedMonths = 1;
        int expectedYear = 2000;
        setAssertEquals(expectedDay, expectedMonths, expectedYear);
    }
    @Test
    @DisplayName("Test the last day 31 of months")
    void testLastDayOfMonth1() {
        NextDayCalculator.setDay(31);
        NextDayCalculator.setMonth(1);
        NextDayCalculator.setYear(2000);
        int expectedDay = 1;
        int expectedMonths = 2;
        int expectedYear = 2000;

        setAssertEquals(expectedDay, expectedMonths, expectedYear);
    }@Test
    @DisplayName("Test the last day 30 of months")
    void testLastDayOfMonth2() {
        NextDayCalculator.setDay(30);
        NextDayCalculator.setMonth(4);
        NextDayCalculator.setYear(2000);
        int expectedDay = 1;
        int expectedMonths = 5;
        int expectedYear = 2000;
        setAssertEquals(expectedDay, expectedMonths, expectedYear);
    }
    @Test
    @DisplayName("Test last day Feb leapyear")
    void testLastDayFebLeapYear(){
        NextDayCalculator.setDay(28);
        NextDayCalculator.setMonth(2);
        NextDayCalculator.setYear(2000);
        int expectedDay = 29;
        int expectedMonths = 2;
        int expectedYear = 2000;
        setAssertEquals(expectedDay, expectedMonths, expectedYear);
    }
    @Test
    @DisplayName("Test last day Feb non-leapyear")
    void testLastDayFebNoLeapYear(){
        NextDayCalculator.setDay(28);
        NextDayCalculator.setMonth(2);
        NextDayCalculator.setYear(2001);
        int expectedDay = 1;
        int expectedMonths = 3;
        int expectedYear = 2001;
        setAssertEquals(expectedDay, expectedMonths, expectedYear);
    }
    @Test
    @DisplayName("Test last day of year")
    void testLastDayOfYear(){
        NextDayCalculator.setDay(31);
        NextDayCalculator.setMonth(12);
        NextDayCalculator.setYear(2001);
        int expectedDay = 1;
        int expectedMonths = 1;
        int expectedYear = 2002;
        setAssertEquals(expectedDay, expectedMonths, expectedYear);
    }@Test
    @DisplayName("Test last day of year")
    void testLastDayOfYear2(){
        NextDayCalculator.setDay(31);
        NextDayCalculator.setMonth(12);
        NextDayCalculator.setYear(2019);
        int expectedDay = 1;
        int expectedMonths = 1;
        int expectedYear = 2020;
        setAssertEquals(expectedDay, expectedMonths, expectedYear);
    }

    private void setAssertEquals(int expectedDay, int expectedMonths, int expectedYear) {
        int resultDay = NextDayCalculator.setNextDay();
        assertEquals(expectedDay, resultDay);
        int resultMonth = NextDayCalculator.setNextMonth();
        assertEquals(expectedMonths, resultMonth);
        int resultYear = NextDayCalculator.setNextYear();
        assertEquals(expectedYear, resultYear);
    }
}