package practice;

public class Person {
    int age;
    String name;
    boolean isMarried;
    int numOfChildren;
    
    public void showPersonInfo() {
        System.out.println("나이 : " + age);
        System.out.println("이름 : " + name);
        System.out.println("결혼여부 : " + isMarried);
        System.out.println("자녀수 : " + numOfChildren);
    }
}
