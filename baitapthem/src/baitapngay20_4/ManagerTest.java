import java.util.Calendar;

public class ManagerTest {
    public static void main(String[] args) {
        int totalMoney = 0;
        int totalMoneyFlour = 0;
        int totalMoneyMeet = 0;
        int Discount = 0;
        Material[] material = new Material[10];
        material[0] = new crispyFlour("No1","Flour1",2019,10,5,20000,5);
        material[1] = new crispyFlour("No2","Flour2",2019,8,21,18000,15);
        material[2] = new crispyFlour("No3","Flour3",2019,11,3,28000,40);
        material[3] = new crispyFlour("No4","Flour4",2019,5,26,15000,30);
        material[4] = new crispyFlour("No5","Flour5",2019,7,16,30000,24);
        material[5] = new Meet("Meet1", "Goat", 2020,4,11, 80000,10,3);
        material[6] = new Meet("Meet2","Chicken",2020,4,10,70000,25,5);
        material[7] = new Meet("Meet3","Pork",2020,4,7,120000,30,3);
        material[8] = new Meet("Meet4","Fish",2020,4,13,60000,10,5);
        material[9] = new Meet("Meet5","Duck",2020,4,15,50000,15,6);


        for (Material manager:material){
            if(manager instanceof crispyFlour){
                crispyFlour flourManager = (crispyFlour) manager;
                totalMoneyFlour += flourManager.abs();
                totalMoney += flourManager.abs();
                Discount += flourManager.discountPercent(5);
                if(ManagerTest.remainingDay(flourManager) >= 120) {
                    Discount += flourManager.discountPercent(20);
                }else if(ManagerTest.remainingDay(flourManager) >= 60) {
                    Discount += flourManager.discountPercent(40);
                }else {
                    Discount += flourManager.discountPercent(0);
                }
            }else if(manager instanceof Meet){
                Meet meet = (Meet)manager;
                totalMoneyMeet += meet.abs();
                totalMoney += meet.abs();
                Discount += meet.discountPercent(10);
                if(ManagerTest.remainingDay(meet) >= 5){
                    Discount += meet.discountPercent(30);
                }else if(ManagerTest.remainingDay(meet) >= 3){
                    Discount += meet.discountPercent(50);
                }else {
                    Discount += meet.discountPercent(0);
                }
            }
        }

        System.out.printf("Money Flour: %d VND !\n", totalMoneyFlour);
        System.out.printf("Money Meat: %d VND !\n", totalMoneyMeet);
        System.out.printf("Total money : %d VND !\n", totalMoney);
        System.out.printf("Money Discount: %d VND !", Discount);

    }
    public static int remainingDay(Material material){
        Calendar today = Calendar.getInstance();
        Calendar exp = material.abstrc();
        int remainDay = exp.get(Calendar.DAY_OF_YEAR) - today.get(Calendar.DAY_OF_YEAR);
        return remainDay;
    }

}
