package storage;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductList extends Product {
    public List<Product> productList = new ArrayList<Product>(10);
}
