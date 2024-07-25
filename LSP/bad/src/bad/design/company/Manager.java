
package bad.design.company;

class Manager extends Employee
{

    public Manager(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }
    
    public void calculateSalary()
    {
        System.out.println("Calculating Salary For A Manager");
    }
    public void genarateReposrt()
    {
        // generating reposrts
        System.out.println("Manager is generating a performence report.....");
    }
}
