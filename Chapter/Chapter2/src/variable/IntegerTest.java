package variable;


public class IntegerTest{
    
    public static void main(String[] args){
        /*리터럴 : 리터럴이란 프로그램에 직접 표현한 값을 말한다. 정수, 실수, 문자, 논리, 문자열타입 모두 리터럴이 있다.*/
        
        //정수 리터럴은 int타입으로 자동 컴파일된다. 만일 long타입으로 지정하려면 숫자 뒤에 L또는 l을 붙이면 된다.
        
        //java에서 정수는 int(4byte)에 저장된다. 따라서 int범위를 넘어서는 숫자는 다른 형으로 저장하는데 이때 숫자 뒤에 long은 L또는 l을 붙인다.
        int age = 10;
        long g = 1234567890000l;
        
        
        
        System.out.println(age);
        System.out.println(g);
    }
}
