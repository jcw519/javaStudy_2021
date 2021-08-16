package array;

public class SkewedArray {
    
    public static void main(String[] args) {
        int skewedArray[][] = new int [4][];
        skewedArray[0] = new int[3];
        skewedArray[1] = new int[2];
        skewedArray[2] = new int[3];
        skewedArray[3] = new int[2];
   
        for(int i = 0; i < skewedArray.length; i++){
            for(int j = 0; j < skewedArray[i].length; j++){
                skewedArray[i][j] =  (i+1)*10 + j;
            }
        }
        
        for(int i = 0; i < skewedArray.length; i++){
            for(int j = 0; j < skewedArray[i].length; j++){
                System.out.print(skewedArray[i][j]+ " ");
            }
            System.out.println();
        }
        
    }
}
