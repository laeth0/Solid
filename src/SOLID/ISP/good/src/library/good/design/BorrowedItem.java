package library.good.design;

import java.time.LocalDate;

public abstract class BorrowedItem extends LibraryItem implements IBorrowable{
   
    protected String Borrower;
    protected static final int DUE_TO_IN_DAYS = 30;
    protected LocalDate DueDate;
    protected LocalDate BorrowDate;

    public BorrowedItem(int id, String name) {
        super(id, name);
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

    @Override
    public LocalDate getDueDate() {
        return this.DueDate;
    }

    @Override
    public LocalDate getBorrowedDate() {
        return this.BorrowDate;
    }
}
