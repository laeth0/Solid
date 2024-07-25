package library.good.design;

import java.time.LocalDate;

public class Book extends IBorrowedBook{
    
    private String author;
    private int pages;
    public Book(int id, String name) {
        super(id, name);
    }

    @Override
    public void setPages(int pages) {
         this.pages= pages;
    }

    @Override
    public int getPages() {
        return pages;
    }
    
    @Override
    public void setAuthor(String author) {
         this.author= author;
    }

    @Override
    public String getAuthor() {
        return author;
    }
    
    public void setBorrower(String Borrower) {
        this.Borrower = Borrower;
    }

    
}
