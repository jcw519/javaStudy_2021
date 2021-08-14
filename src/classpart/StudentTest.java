package classpart;

public class StudentTest {
    
    public static void main(String[] args){
        
        //클래스 생성
        Student studentLee = new Student(); //생성자
        studentLee.studentName = "이순신";
        studentLee.address = "서울";
        
        studentLee.showStudentInfo();
        
        Student studentKim = new Student();
        studentKim.studentName = "김유신";
        studentKim.address = "경주";
        
        studentKim.showStudentInfo();
        
        //stack에 studentLee가 생성 -> heap 메모리의 address를 가리킨다.
        System.out.println(studentLee);  //classpart.Student@28d93b30<-주소값
        System.out.println(studentKim);
              
        
    }
    
}
