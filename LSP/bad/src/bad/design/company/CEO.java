package bad.design.company;

public class CEO extends Employee{

    public CEO(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }
    
    
    @Override
    public void calculateSalary()
    {
        System.out.println("Calculating Salary For The CEO ...");
    }
       public void genarateReposrt()
    {
        // generating reposrts
        System.out.println("Manager is generating a performence report.....");
    }
       
    @Override
    public void assignManager(Employee manager) 
    {
       throw new UnsupportedOperationException("This method is not applicable for this implementation.");
    }
    
}
