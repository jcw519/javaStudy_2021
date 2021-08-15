package staticex;

public class CompanyTest {
    
    public static void main(String[] args) {
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();
        
        //두개 모두 같은 객체
        System.out.println(company1);
        System.out.println(company2);
    }
}
