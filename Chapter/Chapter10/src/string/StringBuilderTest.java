package string;

public class StringBuilderTest {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");
        
        StringBuilder buffer = new StringBuilder(java);
        //연결전 메모리값
        System.out.println(System.identityHashCode(buffer));
        buffer.append(android);
        
        //연결(append)후 메모리값은 동일하다
        System.out.println(System.identityHashCode(buffer));
        
        java = buffer.toString();
        System.out.println(System.identityHashCode(java));
        System.out.println(java);
    }
}
