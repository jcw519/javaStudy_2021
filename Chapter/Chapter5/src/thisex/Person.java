package thisex;

public class Person {
    
    String name;
    int age;
    
    //아무값도 주어지지 않는다면 String은 NULL, int는 0으로 초기화 된다.
    
    
    public Person() {
        //this.name = "이름없음"
        //this.age = 1;
        
        this("이름없음",1); //this()는 클래스 내에서 생성자가 다른 생성자를 호출할 때 사용하는 코드
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
