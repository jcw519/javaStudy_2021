package staticex;

public class Student { //public 클래스와 java파일의 이름은 동일해야한다.
    
    private static int serialNum = 1000;
    
    //멤버 변수
    private int studentID;  //public : 접근제어자 private: 외부에서 참조 불가능
    public String studentName;
    public String address;
    
    public Student(String name) {
        studentName = name;
        serialNum++;
        studentID = serialNum;
    }
    
    public Student(int id, String name) {
        studentID = id;
        studentName = name;
        serialNum++;
        studentID = serialNum;
    }
    
    
    //method
    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }
    
    public String getStudentName() {
        return studentName;
    }
    
    public int getStudentID(){
        return studentID;
    }
    
    public static int getSerialNum(){
        return serialNum;
    }
}
