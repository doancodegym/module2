package controller;

import model.Vocabulary;
import storage.VocabularyList;

import java.io.*;
import java.util.List;

public class Manager extends VocabularyList implements Option {
    final static String FILE_MANAGER = "C:\\Codegym\\module2\\baitapluyencode\\src\\storage\\list.txt";
    final static String FILE_USER = "C:\\Codegym\\module2\\baitapluyencode\\src\\storage\\listUser.txt";


    public void addVocabulary(String[] list){
        Vocabulary vocabulary = new Vocabulary(list[0],list[1],list[2],list[3],list[4],list[5]);
        this.list.add(vocabulary);

    }
    @Override
    public void edit(String nameOld,String newName,String type,String translate,String link,String example,String exampleVN) {
       for (int i = 0; i < list.size(); i++){
           if(list.get(i).getName().equals(nameOld) ){
               list.get(i).setName(newName);
               list.get(i).setType(type);
               list.get(i).setTranslate(translate);
               list.get(i).setLink(link);
               list.get(i).setExample(example);
               list.get(i).setExampleVN(exampleVN);
           }
       }
    }

    @Override
    public void delete(String name) {
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).getName().equals(name)){
                list.remove(i);
            }
        }
    }

    @Override
    public void search(String name) {
        for (int i = 0; i< list.size(); i++) {
            if(list.get(i).getName().equals(name)){
                System.out.println("Từ vựng : " +
                        list.get(i).getName() +
                        list.get(i).getType() + " : "+
                        list.get(i).getTranslate());
                System.out.println("Phát âm : " +
                        list.get(i).getLink());
                System.out.println("Ví dụ : " +
                        list.get(i).getExample()+"("+
                        list.get(i).getExampleVN()+")");
                System.out.println("=========================");
            }
        }
    }

    public void ShowInfo() {
        for (int i = 0; i < list.size(); i++){
            System.out.print("Từ vựng : " +
                    list.get(i).getName() +
                    list.get(i).getType() + " : "+
                    list.get(i).getTranslate()+"\n");
            System.out.println("Phát âm : " +
                    list.get(i).getLink());
            System.out.println("Ví dụ : " +
                    list.get(i).getExample()+"("+
                    list.get(i).getExampleVN()+")");
            System.out.println("=========================");

        }
    }

    //push lại dữ liệu trước khi két thúc chương trình
    public void push() throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_MANAGER);
        for (Vocabulary check: list){
            fileWriter.write(""+
                    check.getName()+"_"+
                    check.getType()+"_"+
                    check.getTranslate()+"_"+
                    check.getLink()+"_"+
                    check.getExample()+"("+
                    check.getExampleVN()+")\n");
            fileWriter.flush();
        }
        fileWriter.close();
    }
    public void readFileMember() throws IOException {

        File fileProduct = new File(FILE_USER);
        FileReader fileReader = new FileReader(fileProduct);

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        while ((line = bufferedReader.readLine())!= null){
            String[] listUser = line.split("_");
            System.out.print("Từ vựng : " +
                    listUser[0] +
                    listUser[1] + " : "+
                    listUser[2]+"\n");
            System.out.println("Phát âm : " + listUser[3]);
            System.out.println("Ví dụ : " + listUser[4]);
            System.out.println("=========================");
        }
        fileReader.close();
    }
}
