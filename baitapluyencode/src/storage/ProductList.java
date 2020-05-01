package storage;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductList extends Product {
    public List<Product> productList = new ArrayList<Product>(10);

//    public ProductList() {
//
//    }
//
//    public ArrayList<Product> ProductList() {
//        return productList;
//    }
//    public ProductList(String name, int id, int price, boolean status, String description) {
//        super(name, id, price, status, description);
//        Product product = new Product(name, id, price, status, description);
//        productList.add(product);
//    }
//    public void add(String name, int id, int price, boolean status, String description){
//        this.setName(name);
//        this.setId(id);
//        this.setPrice(price);
//        this.setStatus(status);
//        this.setDescription(description);
//    }
//    public int size(){
//        return productList.size();
//    }

}
