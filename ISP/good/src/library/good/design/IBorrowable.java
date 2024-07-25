
package library.good.design;

import java.time.LocalDate;

public interface IBorrowable {
    void checkin (String name);
    void checkout();
    LocalDate getDueDate();
    LocalDate getBorrowedDate() ;
}
