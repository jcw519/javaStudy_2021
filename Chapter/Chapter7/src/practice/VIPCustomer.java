package practice;

public class VIPCustomer extends Customer{
    
    double salesRatio;
    private int agentID;
    
    /*public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }*/
    
    public VIPCustomer(int customerID, String customerName, int agentID){
        super(customerID, customerName);
        customerGrade = "VIP";
        this.agentID = agentID;
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }
    
    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price -= (int)(price * salesRatio);
    }
    
    public String showCustomerInfo() {
        return super.showCustomerInfo() + "담당 상담원 번호는 " + agentID + "입니다";
    }
    
    public int getAgentID(){
        return agentID;
    }
    
}
