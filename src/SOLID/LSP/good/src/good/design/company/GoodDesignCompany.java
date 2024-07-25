
package good.design.company;


public class GoodDesignCompany {

    public static void main(String[] args) {
               
       // This is a demo code that creates employee and manager
       
       Employee employee = new Employee(1,"Ahmad","Al-Ahmad");
       IManager manager = new Manager(2,"Adam","Adam");
       employee.assignManager(manager);
       System.out.println("success");
       
       /* 
        After Applying LSP, the CEO is no longer an Employee, instead it is a manager (implement IManager)
       and a Base Employee. Then, no way the CEO is assiged a manager, which goes well with the reqierments
        */
//       BaseEmployee employee = new CEO(1,"Ahmad","Al-Ahmad");
//       IManager manager = new Manager(2,"Adam","Adam");
//       employee.assignManager(manager);
//       System.out.println("success");
    }
    
}
