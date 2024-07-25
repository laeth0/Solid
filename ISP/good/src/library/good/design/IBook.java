package library.good.design;

interface IBook {
    public abstract void setPages(int pages);
    public abstract int getPages();
    
    public abstract String getAuthor();
    public abstract void setAuthor(String author);
}
