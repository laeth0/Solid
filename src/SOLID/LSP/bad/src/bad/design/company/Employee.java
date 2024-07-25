package bad.design.company;


public class Employee {

    
    private int id;
    private String firstName;
    private String lastName;
    private Employee manager;
    private float Salary;


    
    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void calculateSalary()
    {
        System.out.println("Calculating Salary For Regular Employee...");
    }
    public void assignManager(Employee manager)
    {
        if(manager instanceof Manager)
            this.manager = manager;
    }
    
        public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Employee getManager() {
        return manager;
    }


   
    
}
