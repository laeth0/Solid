
package library.good.design;

public class RefernceBoook implements IBook {
    private int pages;
    private String author;   
    
    public RefernceBoook(int pages, String author) {
        this.pages = pages;
        this.author = author;
    }
    
    @Override
    public int getPages() {
        return pages;
    }
@Override
    public String getAuthor() {
        return author;
    }
@Override
    public void setPages(int pages) {
        this.pages = pages;
    }
@Override
    public void setAuthor(String author) {
        this.author = author;
    }

}
