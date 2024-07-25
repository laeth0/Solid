package borrowingservice.good;

import borrowingservice.good.Models.Book;
import borrowingservice.good.Models.User;
import borrowingservice.good.Repositories.BookRepository;
import borrowingservice.good.Repositories.IBookRepository;
import borrowingservice.good.Repositories.IUserRepository;

import borrowingservice.good.Repositories.UserRepository;

public class BorrowingService {

    public BorrowingService(IBookRepository bookRepo, IUserRepository userRepo) {
        this.bookRepo = bookRepo;
        this.userRepo = userRepo;
    }
    
    /*
    Here we only change the dependences of the class
    istead of depending on the implementation (Repos classes)
    the BorrowingService now depends on the abstraction (repos interfaces)
    thus, we can change easily and accept any class that implements this interface
    without affecting the code itself for this class.
    this class won't change, as the Repository changed, becouse both are using a contract
    both depend on IRepository (the abstraction) that is rarely change.
    also, we can user the mock for unit testing.
    */
    private IBookRepository bookRepo;
    private IUserRepository userRepo;
    

    
    public void Borrow(Book book, User user)
    {
            if(Validate(book,user))
            {
            user.AddBook(book);
            bookRepo.Update(book);
            userRepo.Update(user);
            System.out.println("User " + user.getName()+"has successfully borrowed the book "+ book.getTitle());
            }
            else{
                System.out.println("Borrowd failed.");
            }
        
    }
    
    private boolean Validate(Book book, User user)
    {
        if(book == null)
        {
            System.out.println("book not exists.");
            return false;
        }
        else if(user == null)
        {
            System.out.println("user not exists.");
            return false;
        }
        return true;
    }
    
    
    
}
