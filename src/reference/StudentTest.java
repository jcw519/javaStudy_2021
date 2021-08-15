package reference;

public class StudentTest {
    
    public static void main(String[] args){
        
        Student studentLee = new Student(100, "Lee");
        studentLee.korea.setSubject("국어", 100);
        studentLee.math.setSubject("수학", 90);
        
        Student studentKim = new Student(101, "Kim");
        studentKim.korea.setSubject("국어", 95);
        studentKim.math.setSubject("수학", 80);
        
        studentLee.showStudentScore();
        studentKim.showStudentScore();
        
    }
}
