package array;

public class CharArrayTest {
    
    public static void main(String[] args) {
        
        char[] alpahbets = new char[26];
        
        //문자도 정수로 표현가능
        char ch = 'A';
        
        for(int i = 0; i < alpahbets.length; i++){
            alpahbets[i] = ch++;
        }
        
        for(int i = 0; i < alpahbets.length; i++){
            System.out.println(alpahbets[i] + " " + (int)alpahbets[i]);
        }
    }
}
