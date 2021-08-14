package classpart;

public class Student { //public 클래스와 java파일의 이름은 동일해야한다.
    
    //멤버 변수
    public int studentID;  //public : 접근제어자
    public String studentName;
    public String address;
    
    
    //method
    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }
    
    public String getStudentName() {
        return studentName;
    }
    
}
