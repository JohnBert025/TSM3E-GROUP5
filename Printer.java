public class Printer {
     public void print(Person p){
     System.out.println(" Person Name is :"+ p.name());
       System.out.println("---------------------------");
     }
    public void print1  (Customer c){
     System.out.println("Customer Name is:"+ c.name());
     System.out.println("address is: tarlac ");
     System.out.println("budget:"+c.budget());
     System.out.println("purchase: 1 pillow ");
               System.out.println("---------------------------");
   }
    public void print2(SalesPerson sp){
    System.out.println("Name is:"+ sp.name());
    System.out.println("Employee Number:"+ sp.employeeNumber());
     System.out.println("Basic Sallary:"+ sp.basicSalary());
      System.out.println("Commission:"+ sp.commission());
          System.out.println("---------------------------");
}
     public void print3(Manager mg){
    System.out.println("allowance:"+ mg.allowance());
     }
}
