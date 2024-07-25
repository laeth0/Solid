package borrowingservice.good.Models;

public class Book {

    private int id;
    private String title;
    private String author;
    private boolean available;
    
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
        public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
        public boolean isAvailable() {
        return available;
    }
    
            public void setAvailable(boolean available) {
        this.available = available;
    }

}
