
package borrowingservice.bad;

import java.util.ArrayList;
import java.util.List;

public class User {
    
    private int id;
    private String name;
    private List<Book> borrowedBooks;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList();
    }
    public void AddBook (Book book)
    {
        if(book ==null)
            System.out.println("InValid Item.");
        else if(!book.available)
            System.out.println("Book is not availabe.");
        else if(borrowedBooks.contains(book))
            System.out.println("Book already borrowed.");
        else {
            borrowedBooks.add(book);
            System.out.println("Book"+book.title+" added successfully");
        }
    }
        public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}
