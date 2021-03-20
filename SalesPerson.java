public class SalesPerson extends Employee{
    public String spCommission;
    public String spTakeOrder;
    public SalesPerson(String spName) {
        super(spName);
    }

    public void commission (String spCommission){
    this.spCommission = spCommission;
    }
    public String commission (){
    return spCommission;}
    
    public void takeorder (String spTakeOrder){
    this.spTakeOrder = spTakeOrder;
    }

   
    
    
}
