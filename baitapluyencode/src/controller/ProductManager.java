package controller;

import model.Product;
import storage.ProductList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class ProductManager extends ProductList implements OptionProduct {
    public void addProduct(String[] list){
        Product product = new Product(list[0],Integer.parseInt(list[1]),Integer.parseInt(list[2]),list[3],list[4]);
        productList.add(product);

    }
    @Override
    public void edit(int index,String name, int id, int price, String status, String description) {
       for (int i = 0;i < productList.size();i++){
           if(i == index){
               productList.get(i).setName(name);
               productList.get(i).setId(id);
               productList.get(i).setPrice(price);
               productList.get(i).setStatus(status);
               productList.get(i).setDescription(description);
           }
       }
    }

    @Override
    public void delete(String name) {
        for (int i = 0;i < productList.size();i++){
            if(productList.get(i).getName()== name){
                productList.remove(i);
            }
        }

    }

    @Override
    public void search(String name) {
        for (int i = 0;i < productList.size();i++){
            if(productList.get(i).getName() == name){
                System.out.println("Thông tin sản phẩm :");
                System.out.println("Tên SP : " + productList.get(i).getName());
                System.out.println("ID : " + productList.get(i).getId());
                System.out.println("Giá SP : " + productList.get(i).getPrice());
                System.out.println("Trạng thái : " + productList.get(i).getStatus());
                System.out.println("Mô tả : " + productList.get(i).getDescription());
            }
        }
    }

    @Override
    public void soft(boolean check) {
        TreeMap<Integer,Product> softProduct = new TreeMap<Integer,Product>();
        for (Product product:productList) {
            softProduct.put(product.getPrice(),product);
        }
        if(check){
            for (int key : softProduct.keySet()){
                System.out.println("Thông tin sản phẩm :");
                System.out.println("Tên SP : " + softProduct.get(key).getName());
                System.out.println("ID : " + softProduct.get(key).getId());
                System.out.println("Giá SP : " + softProduct.get(key).getPrice());
                System.out.println("Trạng thái : " + softProduct.get(key).getStatus());
                System.out.println("Mô tả : " + softProduct.get(key).getDescription());
                System.out.println("====================");
            }
        }else {
            for (int key : softProduct.descendingMap().keySet()){
                System.out.println("Thông tin sản phẩm :");
                System.out.println("Tên SP : " + softProduct.get(key).getName());
                System.out.println("ID : " + softProduct.get(key).getId());
                System.out.println("Giá SP : " + softProduct.get(key).getPrice());
                System.out.println("Trạng thái : " + softProduct.get(key).getStatus());
                System.out.println("Mô tả : " + softProduct.get(key).getDescription());
                System.out.println("====================");
            }
        }
    }
    public void ShowInfo() {
        for (int i = 0;i < productList.size();i++){
            System.out.println("Thông tin sản phẩm :");
            System.out.println("Tên SP : " + productList.get(i).getName());
            System.out.println("ID : " + productList.get(i).getId());
            System.out.println("Giá SP : " + productList.get(i).getPrice());
            System.out.println("Trạng thái : " + productList.get(i).getStatus());
            System.out.println("Mô tả : " + productList.get(i).getDescription());
            System.out.println("====================");

        }
    }
}
