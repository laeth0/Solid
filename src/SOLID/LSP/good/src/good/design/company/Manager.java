package good.design.company;

public class Manager extends BaseEmployee implements IManager, IManaged {

    IManager manager;
    public Manager(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    @Override
    public void genarateReposrt() {
        System.out.println("A Manager generates a report ...");
    }

    @Override
    public void assignManager(IManager manager) {
       this.manager= manager;
        System.out.println("manager is assign");
        
    }

    @Override
    public IManager getManager() {
       return manager;
    }
    
}
