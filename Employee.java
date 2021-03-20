public class Employee extends Person {
    public String empNumber;
    public String empBasicSalary;
    
    public Employee(String empName) {
        super(empName);
    }
     
    public void employeeNumber (String empNumber){
    this.empNumber = empNumber;}
    
    public String employeeNumber(){
    return empNumber;}
    
      public void basicSalary (String empBasicSalary){
    this.empBasicSalary = empBasicSalary;}
    
    public String basicSalary(){
    return empBasicSalary;}
    
    
 
}
