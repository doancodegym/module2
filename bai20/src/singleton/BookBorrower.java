package singleton;

public class BookBorrower {
    private BookSingleton borrowedBook;
    private boolean haveBook = false;

    //mượn sách
    public void borrowBook(){
        borrowedBook = BookSingleton.borrowBook();

        if(borrowedBook == null){
            haveBook = false;
        }else {
            haveBook = true;
        }
    }

    //thông tin sách mượn
    public String getAuthorAndTitle(){
        if(haveBook){
            return borrowedBook.getAuthorAndTitle();
        }
        return "I don't have the book";
    }

    //trả sách
    public void returnBook(){
        borrowedBook.returnBook(borrowedBook);
    }
}
