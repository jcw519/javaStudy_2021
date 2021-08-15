package reference;


public class Student {
    
    int studentID;
    String studentName;
    Subject korea;
    Subject math;
    
    //생성자에서 초기화
    public Student(int id, String name) {
        studentID= id;
        studentName = name;
        
        korea = new Subject();
        math = new Subject();
    }
    
    public void showStudentScore() {
        int total = korea.score + math.score;
        System.out.println(studentName + "학생의 총점은" + total + "점 입니다.");
    }
    
}
