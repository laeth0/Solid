package good.design.company;

public interface IManaged {

    public void assignManager(IManager manager);
    public IManager getManager();

}
