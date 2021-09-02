package cooperation;

public class Student {
    
    String studentName;
    int grade;
    int money;
    
    public Student(String studentName, int money){
        this.studentName = studentName;
        this.money = money;
    }
    
    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }
    
    public void takeSubway(Subway subway) {
        subway.take(1200);
        this.money -= 1200;
    }
    
    public void takeTaxi(Taxi taxi, int money) {
        taxi.take(money);
        this.money -= money;
    }
    
    public void showInfo() {
        System.out.println(studentName + "님의 남은돈은 " + money +"원 입니다.");
    }
}
