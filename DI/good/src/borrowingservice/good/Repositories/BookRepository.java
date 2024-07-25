
package borrowingservice.good.Repositories;

import borrowingservice.good.Models.Book;

public class BookRepository implements IBookRepository {
    public void Update(Book book)
    {
        /*
        this is a demo class that represent a virtual access to the DB
        */
        System.out.println("Book is updated successfully.");
        
        // other methods insert, delete, getById, getList
    }
}
