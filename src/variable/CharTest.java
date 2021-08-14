package variable;

public class CharTest {
    
    public static void main(String[] args) {
        
        char ch = 'A';
        System.out.println(ch);
        System.out.println((int)ch);
        
        int ich = 66;
        System.out.println(ich);
        System.out.println((char)ich);
        
        char hangul = '\uAC00'; //유니코드 사용법
        System.out.println(hangul);
    }
    
}
