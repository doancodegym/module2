package baitapngay20_4;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Material {
    String id,name;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    Calendar manufactorDate = Calendar.getInstance();

    public Material() {
    }

    public Material(String id, String name, Calendar manufactorDate, int cost) {
        this.id = id;
        this.name = name;
        this.manufactorDate = manufactorDate;
        this.cost = cost;
    }

    int cost;
    public Calendar getManufactorDate() {
        return manufactorDate;
    }
    public Calendar setManufactorDate(int day,int month,int year) {
        this.manufactorDate.set(year,month,day);
        return manufactorDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {

        this.cost = cost;
    }

    public abstract int abs();
    public abstract Calendar abstrc();
}
