package variable;

public class ExplicitConversion {
    public static void main(String[] args) {
        int i = 1000;
        /*Error*/
        //byte bNum = i;
        byte bNum = (byte)i;
        System.out.println(bNum);
        
        double dNum = 1.2;
        float fNum = 0.9F;
        
        //casting시 데이터손실이 발생
        int iNum1 = (int)dNum + (int)fNum;
        int iNum2 = (int)(dNum + fNum);
        System.out.println(iNum1);
        System.out.println(iNum2);
        
    }
}
