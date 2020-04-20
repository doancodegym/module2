import java.util.Calendar;

public class Meet extends Material implements Discount{
    int unit,weight;

    public Meet() {
    }

    public Meet(String id, String name, int year, int month, int date, int cost, int unit, int weight) {
        this.setId(id);
        this.setName(name);
        this.setManufactorDate(year,month,date);
        this.setCost(cost);
        this.unit = unit;
        this.weight = weight;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int abs() {

        return this.cost*this.unit*this.weight;
    }

    @Override
    public Calendar abstrc() {
        Calendar abstrc = this.getManufactorDate();
        abstrc.add(Calendar.DAY_OF_MONTH,15);
        return abstrc;
    }

    @Override
    public int discountPercent(int percent) {
        return this.abs()*percent/100;
    }
}
