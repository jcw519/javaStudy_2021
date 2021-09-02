package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        //HashSet 중복을 허용하지 않고 순서가 없다.
        HashSet<String> set = new HashSet<String>();
        set.add("이순신");
        set.add("김유신");
        set.add("강감찬");
        set.add("이순신");
        
        System.out.println(set);
        
        Iterator<String> ir = set.iterator();
        
        while(ir.hasNext()) {
            String str = ir.next();
            System.out.println(str);
        }
    }
}
/*
<Set 인터페이스>
Collection 하위의 인터페이스
중복을 허용하지 않음
List는 순서기반의 인터페이스지만, set은 순서가 없음
get(i) 메서드가 제공되지 않음 (Iterator로 순회)
저장된 순서와 출력순서는 다를 수 있음
아이디, 주민번호, 사번 등 유일한 값이나 객체를 관리할 때 사용
HashSet, TreeSet클래스


[HashSet 클래스]
Set 인터페이스를 구현한 클래스
중복을 허용하지 않으므로 저장되는 객체의 동일함 여부를 알기 위해 equals()와 
hashCode() 메서드를 재정의 해야 함


[treeSet 클래스]
객체의 정렬에 사용되는 클래스
중복을 허용하지 않으면서 오름차순이나 내림차순으로 객체를 정렬 함
내부적으로 이진 검색 트리(binary search tree)로 구현되어 있음
이진 검색 트리에 자료가 저장 될 때 비교하여 저장될 위치를 정함
객체 비교를 위해 Comparable 이나 Comparator 인터페이스를 구현 해야 함
*/