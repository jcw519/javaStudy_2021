package object;

class Student {
    int studentNum;
    String studentName;
    
    public Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }
    
    //논리적으로 같다
    /*
    1. equals()의 반환값이 같다
    2. hashcode의 값이 같다
    
    일반적으로 equals를 오버라이딩하면 hashcode도 오버라이딩 한다.
    */
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student std = (Student)obj;
            return(this.studentNum == std.studentNum
                  && this.studentName == std.studentName);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        //equals의 조건문에 사용한 멤버변수 값을 활용한다.
        return studentNum;
    }
}

public class EqualsTest {
    
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        
        Student Lee = new Student(100, "이순신");
        Student Lee2 = Lee;
        Student Shin = new Student(100, "이순신");
        
        System.out.println(Lee == Lee2);
        System.out.println(Lee.equals(Shin));
        
        System.out.println(Lee.hashCode());
        System.out.println(Shin.hashCode());
        
        //실제 메모리 값은 당연히 다르다.
        System.out.println(System.identityHashCode(Lee));
        System.out.println(System.identityHashCode(Shin));
        
    }
    
}
