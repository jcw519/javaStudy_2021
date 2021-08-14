package variable;

public class DoubleTest2 {
    public static void main(String[] args) {
        
      double dNum = 1;
        
        for(int i = 0; i < 10000; i++){
            dNum = dNum + 0.1;
        }
        
        //0.1씩 1만번을 더하면 1001이 나올꺼 같지만 실제는 아니다.
        //부동소수점에 방식에 의한 오차
         System.out.println(dNum);
        //출력 : 1001.00000000159
        
    }
}
