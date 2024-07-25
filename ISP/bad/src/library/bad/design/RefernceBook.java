
package library.bad.design;

import java.time.LocalDate;

public class RefernceBook extends LibraryItem {
    
    public RefernceBook(int id, String title, String Author, int pages) {
        super(id, title, Author, pages);
    }
    
    @Override
    public void checkin (String name){
        
        throw new UnsupportedOperationException("This method is not applicable for this implementation.");
    }
    @Override
    public void checkout(){
         throw new UnsupportedOperationException("This method is not applicable for this implementation.");
    }
    @Override
    public LocalDate getDueDate()
    {
        throw new UnsupportedOperationException("This method is not applicable for this implementation.");
    }
    @Override
    public LocalDate getBorrowedDate()
    {
        throw new UnsupportedOperationException("This method is not applicable for this implementation.");
    }
    
}
