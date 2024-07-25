
package library.bad.design;

public class AudioBook extends LibraryItem{

    public AudioBook(int id, String title, String Author, int pages) {
        super(id, title, Author, pages);
    }
    @Override
    public int getPages(){
        
        throw new UnsupportedOperationException("This method is not applicable for this implementation.");
    }
    @Override
    public void setPages(int pages) {
       throw new UnsupportedOperationException("This method is not applicable for this implementation.");
    }
}
