
package library.good.design;

import java.time.LocalDate;


public class AudioBook extends BorrowedItem{
    
    private int DurationInMinutes;

    public AudioBook(int id, String name) {
        super(id, name);
    }
    public int getDurationInMinutes(){
        return DurationInMinutes;
    }
    public void setDurationInMinutes(int min){
        this.DurationInMinutes = min;
    }


}
