package borrowingservice.bad;

public class BorrowingService {
    private BookRepository bookRepo;
    private UserRepository userRepo;
    
    public BorrowingService() {
 
        bookRepo= new BookRepository();
        userRepo = new UserRepository();
    }
    
    public void Borrow(Book book, User user)
    {
            if(Validate(book,user))
            {
            user.AddBook(book);
            bookRepo.Update(book);
            userRepo.Update(user);
            System.out.println("User " + user.getName()+"has successfully borrowed the book "+ book.title);
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
