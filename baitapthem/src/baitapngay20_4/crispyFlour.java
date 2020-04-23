package baitapngay20_4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class crispyFlour extends Material implements Discount {
    int quantity;

    public crispyFlour() {
    }

    public crispyFlour(String id, String name,int year, int month, int date, int cost, int quantity) {
        this.setId(id);
        this.setName(name);
        this.setManufactorDate(year,month,date);
        this.setCost(cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int abs() {
        return this.quantity*this.cost;
    }

    @Override
    public Calendar abstrc() {
        Calendar abstrc = this.getManufactorDate();
        abstrc.add(Calendar.YEAR,1);
        return abstrc;
    }

    @Override
    public int discountPercent(int percent) {
        return this.abs()*percent/100;
    }
}
