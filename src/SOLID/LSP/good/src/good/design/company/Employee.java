package good.design.company;


public class Employee extends BaseEmployee implements IManaged{
    IManager manager;

    public Employee(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    @Override
    public void assignManager(IManager manager) {
        this.manager = manager;
    }

    @Override
    public IManager getManager() {
       return manager;
    }
   
}
