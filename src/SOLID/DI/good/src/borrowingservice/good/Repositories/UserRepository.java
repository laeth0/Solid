
package borrowingservice.good.Repositories;

import borrowingservice.good.Models.User;


public class UserRepository implements IUserRepository {
        public void Update(User user)
    {
        /*
        this is a demo class that represent a virtual access to the DB
        */
        System.out.println("User is updated successfully.");
        
        // other methods insert, delete, getById, getList
    }
}
