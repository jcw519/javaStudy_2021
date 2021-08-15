package thisex;

public class Person {
    
    String name;
    int age;
    
    //아무값도 주어지지 않는다면 String은 NULL, int는 0으로 초기화 된다.
    
    
    public Person() {
        //this.name = "이름없음"
        //this.age = 1;
        
        this("이름없음",1);
    }
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void showInfo() {
        System.out.println(name + "," + age + "세");
    }
    
    public Person getSelf() {
        return this;
    }
}
