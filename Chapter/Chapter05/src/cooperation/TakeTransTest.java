package cooperation;

public class TakeTransTest {
    
    public static void main(String[] args) {
        Student studentJ = new Student("James", 5000);
        Student studentT = new Student("Tomas", 10000);
        Student studentE = new Student("Edward", 14000);

        Bus bus100 = new Bus(100);
        Bus bus200 = new Bus(200);
        Subway subwayGreen = new Subway(2);
        Subway subwayBlue = new Subway(4);
        Taxi taxi4885 = new Taxi(4885);


        studentJ.takeBus(bus100);
        studentT.takeSubway(subwayGreen);
        studentE.takeTaxi(taxi4885, 10000);

        studentJ.showInfo();
        studentT.showInfo();
        studentE.showInfo();

        bus100.showBusInfo();
        bus200.showBusInfo();

        subwayGreen.showSubwayInfo();
        subwayBlue.showSubwayInfo();
        
        taxi4885.showTaxiInfo();
    }
    
}
