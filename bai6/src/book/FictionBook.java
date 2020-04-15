package book;

public class FictionBook extends Book{
    private String category;
    FictionBook(){
    }
    FictionBook(String category){
        this.category = category;
    }
    FictionBook(String name,String author,int price,int bookCode,String category){
        super(name, author, price, bookCode);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public String toString(){
        return super.toString()+
                "\nCategory : "+getCategory()
                +"\n-----------------------";
    }
}
