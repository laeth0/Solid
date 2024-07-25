package good.design.company;

public class BaseEmployee {
       
    private int id;
    private String firstName;
    private String lastName;
    private float Salary;

    public BaseEmployee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void calculateSalary()
    {
        System.out.println("Calculating Salary For Regular Employee...");
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
   
}


