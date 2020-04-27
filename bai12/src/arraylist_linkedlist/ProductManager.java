package arraylist_linkedlist;

import java.util.ArrayList;

public class ProductManager extends Product {
    ArrayList productArray = new ArrayList(10);
    public ProductManager() {
    }

    public ProductManager(String name, int id, int amount, int prince) {
        super(name, id, amount, prince);
        Product product = new Product(name,id,amount,prince);
        productArray.add(product);

    }

    public void add(String name, int id, int amount, int prince){
        this.setName(name);
        this.setId(id);
        this.setAmount(amount);
        this.setPrince(prince);
    }
    public void setProduct(String name, int id, int amount, int prince){
        boolean check = false;
        for (int i = 0 ; i < productArray.size();i++ ){
            Product tempProduct = (Product)productArray.get(i);
            if(tempProduct.getId() == id){
                tempProduct.setName(name);
                tempProduct.setAmount(amount);
                tempProduct.setPrince(prince);
                check = true;
                break;
            }
        }
        if(!check){

                System.out.println("ID không tồn tại");
        }
    }
    public void removeProduct(int id){
        boolean check = false;
        for(int i = 0 ;i < productArray.size();i++){
            Product tempProduct = (Product) productArray.get(i);
            if(tempProduct.getId() == id){
                productArray.remove(i);
                check = true;
                break;
            }
        }
        if(!check){

            System.out.println("ID không tồn tại");
        }
    }
    public void displayByName(String name){
        boolean check = false;
        for(int i = 0 ;i < productArray.size();i++) {
            Product tempProduct = (Product) productArray.get(i);
            if (tempProduct.getName() == name) {
                tempProduct.toString();
                check = true;
                break;
            }
        }
        if(!check){

            System.out.println("Tên SP không tồn tại");
        }
    }
    public void displayFull(){
        for(int i = 0 ;i < productArray.size();i++) {
            Product tempProduct = (Product) productArray.get(i);
            tempProduct.toString();
        }
    }
}
