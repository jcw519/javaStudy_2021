package cooperation;

public class Taxi {
    int taxiNumber;
    int passengerCount;
    int money;
    
    public Taxi(int taxiNumber) {
        this.taxiNumber = taxiNumber;
    }
    
    public void take(int money){
        this.money += money;
        passengerCount++;
    }
    
    public void showTaxiInfo() {
        System.out.println(taxiNumber + "번 택시가 태운 손님은 오늘하루 " + passengerCount + "명 이고, 오늘 하루 수입은 " + money + "원 입니다." );
    }
}
