package arraylist_linkedlist;

public class Product {
    String name;
    int id,amount,prince;

    public Product() {
    }

    public Product(String name, int id, int amount, int prince) {
        this.name = name;
        this.id = id;
        this.amount = amount;
        this.prince = prince;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrince() {
        return prince;
    }

    public void setPrince(int prince) {
        this.prince = prince;
    }
    @Override
    public String toString() {
        return "Thông tin sản phẩm : \n"+ "Tên SP : " + getName() + '\n' +
                "Mã SP : " + getId() +
                "\nSố lượng : " + getAmount() +
                "\nGiá SP :"+getPrince()+"\n==============================";
    }
}
