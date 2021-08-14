package variable;

public class ImplicitConversion {
    
    public static void main(String[] args) {
        
        
        //byte < int
        //byte -> int 묵시적 형변환 : 형변환에 문제없음
        byte bNum = 10;
        int iNum = bNum;
        
        System.out.println(bNum);
        System.out.println(iNum);
        
        //int < float : 모든 정수는 실수에 대입 가능
        //int -> float 묵시적 형변환       
        int iNum2 = 20;
        float fNum = iNum2;
        System.out.println(fNum);
        
        double dNum;
        dNum = fNum + iNum2;  //iNum2이 float로 바뀜
        System.out.println(dNum);
        
        
        
    }
}
