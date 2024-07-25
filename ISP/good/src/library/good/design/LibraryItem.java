package library.good.design;
/*

contains all properties that are shared between all items in the library 
*/

public class LibraryItem {
   
    private int id;
    private String name;
    
    public LibraryItem(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
