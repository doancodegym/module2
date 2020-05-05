package model;

public class Product implements ProductInfomation{
    private String name,description;
    private int id,price;
    private String status;

    public Product() {
    }

    public Product(String name, int id, int price, String status,String description) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.status = status;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void info() {
        System.out.println("Thông tin sản phẩm :");
        System.out.println("Tên SP : " + getName());
        System.out.println("ID : " + getId());
        System.out.println("Giá SP : " + getPrice());
        System.out.println("Trạng thái : " + getStatus());
        System.out.println("Mô tả : " + getDescription());
        System.out.println("====================");

    }
}
