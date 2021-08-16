package exception;

public class NumException {
    public static void main(String[] args){
        String[] stringNumber = {"21", "34", "34", "3.14", "KK"};
        int i = 0;
        
        for(i = 0; i < stringNumber.length; i++){
            try {
                int j = Integer.parseInt(stringNumber[i]);
                System.out.println("정수로 변환된 값은" + j);
            }
            catch(NumberFormatException e) {
                System.out.println(stringNumber[i] + "는 정수로 변환할 수 없습니다.");
            }
        }
        
    }
}
