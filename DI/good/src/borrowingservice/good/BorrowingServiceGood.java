
package borrowingservice.good;

import borrowingservice.good.Models.Book;
import borrowingservice.good.Models.User;
import borrowingservice.good.Repositories.BookRepository;
import borrowingservice.good.Repositories.UserRepository;


public class BorrowingServiceGood {

  
    public static void main(String[] args) {
        
     BorrowingService borrowingService = new BorrowingService(new BookRepository(), new UserRepository());
     /*
        Lets create a demo senario 
     */   
     
     User user = new User(1,"Omar");
     Book book = new Book(1, "The old man and the sea", "Ernest Hemingway") ;
     
     borrowingService.Borrow(book, user);
     
     /*
     The code seems to run without issues, 
     but what if we decided to replace the DB Repository Logic?
     This will require changing in the borrowingService .. read notes there..
     
     */
     
    }
    
}
