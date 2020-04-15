package book;

public class Book {
    private int bookCode;
    private String name,author;
    private int price;

    Book(){
    }
    Book(String name,String author,int price,int bookCode){
        this.name = name;
        this.author = author;
        this.price = price;
        this.bookCode = bookCode;
    }

    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void setBook(String name,String author,int price,int bookCode){
        this.setName(name);
        this.setAuthor(author);
        this.setPrice(price);
        this.setBookCode(bookCode);
    }

    @Override
    public String toString() {
        return "Book Info : \n" +
                "bookCode : " + bookCode +"\n"+
                "Name : " + name + '\n' +
                "Author : '" + author + '\n' +
                "Price :" + price;
    }
}
