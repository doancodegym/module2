package controller;

import model.Vocabulary;
import storage.VocabularyList;

import java.io.*;

public class Manager extends VocabularyList implements Option {
    final static String FILE_USER = "C:\\Codegym\\module2\\case_study\\src\\storage\\listUser.txt";


    public void addVocabulary(String[] array){
        Vocabulary vocabulary = new Vocabulary(array[0],array[1],array[2],array[3],array[4],array[5]);
        this.list.add(vocabulary);

    }
    @Override
    public void edit(String nameOld,String newName,String type,String translate,String link,String example,String exampleVN) {
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).getName().equals(nameOld) ){
                if (!newName.equals(".")){
                    list.get(i).setName(newName);
                }
                if(!type.equals(".")){
                    list.get(i).setType(type);
                }
                if(!translate.equals(".")){
                    list.get(i).setTranslate(translate);
                }
                if(!link.equals(".")){
                    list.get(i).setLink(link);
                }
                if(!example.equals(".")){
                    list.get(i).setExample(example);
                }
                if(!exampleVN.equals(".")){
                    list.get(i).setExampleVN(exampleVN);
                }
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
            if(list.get(i).getName().contains(name)){
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
        FileWriter fileWriter = new FileWriter(FILE_USER);
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
