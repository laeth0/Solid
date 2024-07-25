package library.bad.design;

public class DVD extends LibraryItem {
    
    public DVD(int id, String title) {
        super(id, title, null, 0);
    }
    @Override
    public int getPages(){
        
        throw new UnsupportedOperationException("This method is not applicable for this implementation.");
    }
    
    @Override
    public void setAuthor(String Author) {
        throw new UnsupportedOperationException("This method is not applicable for this implementation.");
    }
    @Override
    public String getAuthor() {
       throw new UnsupportedOperationException("This method is not applicable for this implementation.");
    }
    
    @Override
    public void setPages(int pages) {
       throw new UnsupportedOperationException("This method is not applicable for this implementation.");
    }
}
