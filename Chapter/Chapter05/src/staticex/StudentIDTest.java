package staticex;

public class StudentIDTest {
    
    public static void main(String[] args){
        Student studentLee = new Student("Lee");
        System.out.println(studentLee.getSerialNum());
        //static 변수는 객체의 생성과 상관없다
        //따라서 참조시 클래스명으로 참조한다
        //또한 중요한 static 변수는 private로 만든다
        //private로 만들었을때 get,set 메서드를 만들어준다
        //static 메서드 == 클래스 메서드
        System.out.println(Student.getSerialNum());
        //static메서드 안에서 instance 변수를 쓸 수 없다.
        
    
        Student studentKim = new Student("Kim");
        System.out.println(studentKim.getSerialNum());
        System.out.println(studentLee.getSerialNum());
        
        System.out.println(studentLee.getStudentID());
        System.out.println(studentKim.getStudentID());
        
        System.out.println(Student.getSerialNum());
    }
    
    
}
