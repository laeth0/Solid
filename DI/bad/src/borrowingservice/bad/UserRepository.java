
package borrowingservice.bad;


public class UserRepository {
        public void Update(User user)
    {
        /*
        this is a demo class that represent a virtual access to the DB
        */
        System.out.println("User "+user.getName()+"is updated successfully.");
        
        // other methods insert, delete, getById, getList
    }
}
