package library.bad.design;
import java.time.LocalDate;


public class LibraryItem {

    private int id;
    private String title;
    private String Author;
    private String Borrower;
    private int pages;
    private static final int DUE_TO_IN_DAYS = 30;
    private LocalDate DueDate;
    private LocalDate BorrowDate;

    
    
    public LibraryItem(int id, String title, String Author, int pages) {
        this.id = id;
        this.title = title;
        this.Author = Author;
        this.pages = pages;
        
        this.Borrower = null;
        this.DueDate = null;
        this.BorrowDate = null;

        
    }

    public void checkin(String Borrower) {
        this.Borrower =Borrower;
        this.BorrowDate  = LocalDate.now();
        this.DueDate = this.BorrowDate.plusDays( DUE_TO_IN_DAYS);
    }

    public void checkout() {
        this.Borrower =null;
        this.BorrowDate  = null;
        this.DueDate = null;
        
    }


    public LocalDate getDueDate() {
        return DueDate;
    }
    
    public LocalDate getBorrowedDate() {
        return BorrowDate;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public void setBorrower(String Borrower) {
        this.Borrower = Borrower;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
     public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return Author;
    }

    public String getBorrower() {
        return Borrower;
    }

    public int getPages() {
        return pages;
    }
    
}
