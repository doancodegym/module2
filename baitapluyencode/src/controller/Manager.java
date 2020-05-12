package controller;

import model.Vocabulary;
import storage.VocabularyList;

import java.io.FileWriter;
import java.io.IOException;

public class Manager extends VocabularyList implements Option {
    public void addProduct(String[] list){
        Vocabulary product = new Vocabulary(list[0],list[1],list[2],list[3],list[4],list[5]);
        List.add(product);

    }
    @Override
    public void edit(String nameOld,String newName,String type,String translate,String link,String example,String exampleVN) {
       for (int i = 0; i < List.size(); i++){
           if(List.get(i).getName().equals(nameOld) ){
               List.get(i).setName(newName);
               List.get(i).setType(type);
               List.get(i).setTranslate(translate);
               List.get(i).setLink(link);
               List.get(i).setExample(example);
               List.get(i).setExampleVN(exampleVN);
           }
       }
    }

    @Override
    public void delete(String name) {
        for (int i = 0; i < List.size(); i++){
            if(List.get(i).getName().equals(name)){
                List.remove(i);
            }
        }
    }

    @Override
    public void search(String name) {
        for (int i = 0; i< List.size(); i++) {
            if(List.get(i).getName().equals(name)){
                System.out.println("Từ vựng : " + List.get(i).getName() + List.get(i).getType() + " : "+ List.get(i).getTranslate());
                System.out.println("Phát âm : " + List.get(i).getLink());
                System.out.println("Ví dụ : " + List.get(i).getExample()+"("+ List.get(i).getExampleVN()+")");
                System.out.println("=========================");
            }
        }
    }

    public void ShowInfo() {
        for (int i = 0; i < List.size(); i++){
            System.out.print("Từ vựng : " +
                    List.get(i).getName() +
                    List.get(i).getType() + " : "+
                    List.get(i).getTranslate()+"\n");
            System.out.println("Phát âm : " + List.get(i).getLink());
            System.out.println("Ví dụ : " + List.get(i).getExample()+"("+ List.get(i).getExampleVN()+")");
            System.out.println("=========================");

        }
    }

    //push lại dữ liệu trước khi két thúc chương trình
    public void push() throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\Codegym\\module2\\baitapluyencode\\src\\storage\\list.txt");
        for (Vocabulary check: List){
            fileWriter.write(""+check.getName()+"_"+check.getType()+"_"+check.getTranslate()+"_"+check.getLink()+"_"+check.getExample()+"("+check.getExampleVN()+")\n");
            fileWriter.flush();
        }
        fileWriter.close();
    }
}
