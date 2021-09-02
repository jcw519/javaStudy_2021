package inheritance;

public class CustomerTest {
    
    public static void main(String[] args) {
        /*
        Customer customerLee = new Customer();
        customerLee.setCustomerName("이순신");
        customerLee.setCustomerID(10010);
        customerLee.bonusPoint = 1000;
        
        System.out.println(customerLee.showCustomerInfo());
        */
        
        /*하위 클래스가 생성되는 과정*/
        /*
        하위 클래스가 생성 될 때 상위 클래스가 먼저 생성됨
        
        상위 클래스의 생성자가 호출되고 하위 클래스의 생성자가 호출됨
        하위 클래스의 생성자에서는 무조건 상위 클래스의 생성자가 호출되어야함
        
        하위클래스에서 상위 클래스의 생성자를 호출하는 코드가 없는 경우 컴파일러는 상위 클래스
        기본 생성자를 호출하기 위한 super()를 추가함
        
        super()로 호출되는 생성자는 상위 클래스의 기본 생성자 임
        
        만약 상위 클래스의 기본생성자가 없는 경우 (매개변수가 있는 생성자만 존재 하는 경우)
        하위 클래스는 명시작으로 상위 클래스의 생성자를 호출해야 함.
        */
        
        
        
        /*
        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerName("김유신");
        customerKim.setCustomerID(10020);
        customerKim.bonusPoint = 10000;
        
        System.out.println(customerKim.showCustomerInfo());
        */
        
        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
        System.out.println(customerKim.showCustomerInfo());
        
        
        
        /*상위 클래스로의 묵시적 형 변환(업캐스팅)*/
        /*
        상위 클래스 형으로 변수를 선언하고 하위 클래스 인스턴스를 생성 할 수 있음
        하위 클래스는 상위 클래스의 타입을 내포하고 있으므로 상위 클래스로 묵시적 형변환이 가능 함
        상속관계에서 모든 하위 클래스는 상위 클래스로 묵시적 형 변환이 됨, 그 역은 성립하지 않음
        */
        
        Customer customerJeong = new VIPCustomer(10030, "정채원");
        System.out.println(customerJeong.showCustomerInfo());
        
        /*
        단 VIPCustomer() 생성자의 호출로 인스턴스는 모두 생성 되었지만 
        타입이 Customer 이므로 접근 할 수있는 변수나 메서드는 Customer의 변수와 메서드만 가능.
        */
        
        
        
        /*형 변환과 오버라이딩 메서드 호출*/
        /*
        자바에서는 타입과 상관없이 항상 인스턴스의 메서드가 호출됨
        아래의 경우 VIPCustomer의 메서드가 호출된다.
        */
        Customer customerPark = new VIPCustomer(10040, "박지성");
        System.out.println(customerPark.calcPrice(10000));
        System.out.println(customerPark.showCustomerInfo());
        
        /*
        메서드는 이름 그자체로 주소를 가리킴
        재정의된 메서드는 같은 이름이지만다른 메서드 주소를 가리키게 된다.
        */
        
        
        
        
        
    }
}
