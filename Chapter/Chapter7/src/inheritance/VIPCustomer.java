package inheritance;

public class VIPCustomer extends Customer{
    
    double salesRatio;
    private int agentID;
    
    /*public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }*/
    
    public VIPCustomer(int customerID, String customerName){
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }
}
