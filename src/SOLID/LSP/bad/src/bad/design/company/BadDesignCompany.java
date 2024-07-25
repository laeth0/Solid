package bad.design.company;


public class BadDesignCompany {

    public static void main(String[] args) {
        
       // This is a demo code that creates employee and manager
       
       Employee employee = new Employee(1,"Ahmad","Al-Ahmad");
       Employee manager = new Manager(2,"Adam","Adam");
       employee.assignManager(manager);
       System.out.println("success");
       
       /* 
       To check if LSP is violated run the same code 
       replacing the parent class (Employee) with child class (CEO) 
       and see the result, if ISP is applied, 
       then the execution won't narrow down.
        */
//       Employee employee = new CEO(1,"Ahmad","Al-Ahmad");
//       Employee manager = new Manager(2,"Adam","Adam");
//       employee.assignManager(manager);
//       System.out.println("success");
    }
    
}
