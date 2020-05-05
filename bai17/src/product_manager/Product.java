package product_manager;

public class Product {
    private String name,ID,prince;



    public Product() {
    }

    public Product(String name, String ID, String prince) {
        this.name = name;
        this.ID = ID;
        this.prince = prince;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPrince() {
        return prince;
    }

    public void setPrince(String prince) {
        this.prince = prince;
    }

    public void add(String name,String ID, String prince){
        this.setName(name);
        this.setID(ID);
        this.setPrince(prince);
    }
    public void add(String[] string){
        this.setName(string[0]);
        this.setID(string[1]);
        this.setPrince(string[2]);
    }
    @Override
    public String toString(){
        return "Info " +
                "\nName : " + getName()+
                "\nID : " + getID() +
                "\nPrince : " + getPrince();
    }

}
