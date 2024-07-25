
package library.bad.design;

public class LibraryBadDesign {

/*
    The problem of this code design that some classes are forced to implement 
    methods that do not used..
    this violates ISP
    
    for example DVD class and ReferenceBook class
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        LibraryItem dvd = new DVD(1, "title");
        // this lead to exceptions and errors that hard to track
        dvd.setPages(555);
    }
    
}
