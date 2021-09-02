package practice;

public abstract class Car {
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void drive();
    public abstract void stop();
    
    final public void run(){
        turnOn();
        drive();
        stop();
        turnOff();
    }
    
}
