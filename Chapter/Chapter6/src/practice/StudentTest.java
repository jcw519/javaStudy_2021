package practice;

public class StudentTest {
    public static void main(String[] args) {
        
        Student studentLee = new Student(1001,"Lee");
        Student studentKim = new Student(1002,"Kim");
        Student studentCho = new Student(1003,"Cho");
        
        studentLee.addBook("태백산맥1");
        studentLee.addBook("태백산맥2");
        
        studentKim.addBook("토지1");
        studentKim.addBook("토지2");
        studentKim.addBook("토지3");
        studentKim.addBook("토지4");
        
        studentCho.addBook("해리포터1");
        
        studentLee.showStudentInfo();
        studentKim.showStudentInfo();
        studentCho.showStudentInfo();
        
        
    }
}
