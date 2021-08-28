package string;

public class StringTest {
    public static void main(String[] args) {
        
        /*
        new String()으로 생성된 스트링은 new를 이용하여 생성되는 다른 객체와 동일하게 
        힙 메모리에 생성된다.
        */
        String str1 = new String("abc");
        String str2 = new String("abc");        
        System.out.println(str1 == str2); //false
        
        
        
        /*
        스트링 리터럴은 자바 내부에서 리터럴 테이블로 틀별히 관리하여, 
        동일한 리터럴을 공유시킨다.
        */
        String str3 = "abc";
        String str4 = "abc";
        System.out.println(str3 == str4); //true
        
        
        
    }
}
