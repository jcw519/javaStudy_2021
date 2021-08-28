package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest{
    
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, InvocationTargetException {
        
        Person person = new Person("James");
        System.out.println(person);
        
        /*forName()메서드와 동적 로딩*/
        /*
        Class 클래스 static 메서드
        동적로딩이란? 
        컴파일 시에 데이터 타입이 모두 binding 되어 자료형이 로딩되는 것(static loading)이 아니라 실행 중에
        데이터 타입을 알고 binding 되는 방식
        
        실행 시에 로딩되므로 경우에 따라 다른 클래스가 사용될 수 있어 유용
        
        컴파일 타임에 체크 할 수 없으므로 해당 문자열에 대한 클래스가 없을경우 
        ClassNotFoundException이 발생할 수 있음. 
        */
        Class c1 = Class.forName("classex.Person");
        
        Person person1 = (Person)c1.newInstance();
        System.out.println(person1);
        
        Class[] parameterTypes = {String.class};
        Constructor cons = c1.getConstructor(parameterTypes);
        
        Object[] initargs = {"김유신"};
        Person personLee = (Person)cons.newInstance(initargs);
        System.out.println(personLee);
    }
    
}
