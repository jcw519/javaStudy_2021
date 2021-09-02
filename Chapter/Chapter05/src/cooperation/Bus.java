package cooperation;

public class Bus {
    
    int busNumber;
    int passengerCount;
    int money;
    
    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }
    
    /*승차*/
    public void take(int money) {
        this.money += money;  
    }
    
    public void showBusInfo() {
        System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "입니다.");
    }
}
