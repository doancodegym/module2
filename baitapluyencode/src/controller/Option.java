package controller;

public interface Option {
    public void edit(String nameOld,String newName,String type,String translate,String link,String example,String examplevn);
    public void delete(String name);
    public void search(String name);

}
