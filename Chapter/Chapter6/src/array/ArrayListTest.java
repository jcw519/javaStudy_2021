package array;

import java.util.ArrayList;

public class ArrayListTest {
    
    public static void main(String[] args) {
        //<String> 배열의 요소로 String을 쓰겠다.
        ArrayList<String> list = new ArrayList<String>();
        
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        
        //size : 정확히 요소가 들어간 객수를 반환함
        for(int i = 0; i < list.size(); i++){
            String str = list.get(i);
            System.out.println(str);
        }
        
        for(String s : list) {
            System.out.println(s);
        }
        
    }
}
