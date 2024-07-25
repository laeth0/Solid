package good.design.company;

public class CEO extends BaseEmployee implements IManager {

    public CEO(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    @Override
    public void genarateReposrt() {
        
        System.out.println("CEO generates a report...");
    }
    
}
