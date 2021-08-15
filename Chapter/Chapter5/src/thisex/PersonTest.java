package thisex;

public class PersonTest {
    public static void main(String[] args) {
        Person personLee = new Person("이순신", 25);
        Person personNoname = new Person();
        
        personLee.showInfo();
        personNoname.showInfo();
        
        
        //참조변수의 값과 this가 가리키는 값은 같다 
        System.out.println(personLee);
        
        
        Person p = personLee.getSelf();
        System.out.println(p);
    }
}
