package string;

public class StringTest2 {
    public static void main(String[] args) {
        //스트링 객체는 수정이 불가능하다.
        String java = new String("java");
        String android = new String("android");
        
        
        
        //새로 생성된 문자열을 가리킴
        java = java.concat(android);
        
        System.out.println(java);
        System.out.println(System.identityHashCode(java));
        
        
    }
}
