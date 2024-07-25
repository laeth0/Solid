
package borrowingservice.bad;

public class BookRepository {
    public void Update(Book book)
    {
        /*
        this is a demo class that represent a virtual access to the DB
        */
        System.out.println("Book "+book.title+ " is updated successfully.");
        
        // other methods insert, delete, getById, getList
    }
}
