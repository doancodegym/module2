package main;

import controller.ProductManager;
public class Main {
    public static void main(String[] args) {
        ProductManager product =  new ProductManager();
        product.addProduct("kẹo",1,1000,true,"Kẹo ngon thích hợp cho trẻ em");
        product.addProduct("bánh",2,5000,true,"Kẹo ngon thích hợp cho trẻ em");
        product.addProduct("sữa",3,4000,true,"Sữa tươi ngon hơn khi uống lạnh");
        product.addProduct("trái cây",4,15000,true,"Trái cây tươi nhập khẩu");
        product.addProduct("nước ngọt",5,10000,true,"Nước giải khát mát lạnh");
        product.addProduct("bia",6,12000,true,"Đồ uông chỉ phù hợp với người lớn");

        product.delete("Sữa");
        product.edit(1,"kem",2,5000,true,"Kem thơm ngon mát lạnh");
        product.soft(true);

    }
}
