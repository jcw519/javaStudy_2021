package abstractex;

public abstract class Computer {
    
    //abstract는 생성할 수 없음
    
    public abstract void display();
    public abstract void typing();
    
    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }
    
    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}
