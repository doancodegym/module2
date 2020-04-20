package next_day_calculator;

public class NextDayCalculator {
    final static int FIRST_DAY_OF_MONTH =1;
    final static int FIRST_MONTH_OF_YEAR =1;
    final static int LAST_MONTH_OF_YEAR =12;
    public static boolean isJumpNextMonth = false;
    public static boolean isJumpNextYear = false;
    private static int toDay;
    private static int toMonth;
    private static int toYear;


    public static void setDay(int day){
        toDay = day;
    }
    public static void setMonth(int month){
        toMonth = month;
    }
    public static void setYear(int year){
        toYear = year;
    }


    public static int getDayOfMonth(int month){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if(isLeapYear(toYear)){
                    return 29;
                }else {
                    return  28;
                }
            default:
                return 0;
        }
    }
    public static boolean isLeapYear(int year){
        boolean isLeapYear = false;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    isLeapYear =true;
                }
            }else {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }
    public static int setNextDay(){
        int day = toDay;
        if(day == getDayOfMonth(toMonth)){
            isJumpNextMonth = true;
            return FIRST_DAY_OF_MONTH;
        }else {
            day++;
            return day;
        }

    }
    public static int setNextMonth(){
        int month = toMonth;
        if(isJumpNextMonth){
            isJumpNextMonth = false;
            if(month == LAST_MONTH_OF_YEAR){
                isJumpNextYear = true;
                return FIRST_MONTH_OF_YEAR;
            }else {
                month++;
                return month;
            }
        }else {
            return month;
        }

    }
    public static int setNextYear(){
        int year = toYear;
        if(isJumpNextYear){
            isJumpNextYear = false;
            year ++;
            return year;
        }else {
            return year;
        }
    }


}
