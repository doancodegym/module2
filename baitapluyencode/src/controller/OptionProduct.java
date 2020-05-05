package controller;

public interface OptionProduct {
    public void edit(int index,String name, int id, int price, String status, String description);
    public void delete(String name);
    public void search(String name);
    public void soft(boolean keyword);
}
