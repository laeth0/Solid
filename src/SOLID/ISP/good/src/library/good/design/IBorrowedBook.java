package library.good.design;

public abstract class IBorrowedBook extends BorrowedItem implements IBook{
    
    protected int pages;
    protected String author; 

    public IBorrowedBook(int id, String name) {
        super(id, name);
    }
    
}
