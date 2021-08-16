package array;

public class ReturnArray {
    
    static int[] makeArray(int size){
        int tmp[] = new int[size];
        for(int i = 0; i < tmp.length; i++){
            tmp[i] = i;
        }
        return tmp;
    }
    
    public static void main(String[] args){
        int intArray[] = makeArray(5);
        
        for(int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
        
    }
    
}
