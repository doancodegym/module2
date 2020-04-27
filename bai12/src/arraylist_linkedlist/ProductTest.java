package arraylist_linkedlist;

public class ProductTest {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        manager.add("Áo sơ mi", 1001, 100,3500000);
        manager.add("Áo phông", 1002, 150,80000);
        manager.add("Áo khoác dạ", 1003, 20,400000);
        manager.add("Áo len", 1004, 170,115000);
        manager.add("Áo cộc tay", 1005, 20,50000);
        manager.add("Áo thể thao", 1006, 250,70000);

        manager.removeProduct(1002);
        System.out.println("-----------------------");
        manager.displayFull();
        manager.setProduct("Áo cổ tim", 1003, 140,65000);
        manager.displayByName("Áo len");
        System.out.println("---------------------");
        manager.displayFull();
    }
}
