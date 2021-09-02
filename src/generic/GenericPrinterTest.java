package generic;

public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
        Powder powder = new Powder();
        powderPrinter.setMaterial(powder);
        System.out.println(powderPrinter);
        powderPrinter.printing();
        
        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
        Plastic plastic = new Plastic();
        //plasticPrinter.setMaterial(powder); //오류 발생 컴파일 타임에서 잡아준다.
        plasticPrinter.setMaterial(plastic);
        System.out.println(plasticPrinter);
        plasticPrinter.printing();
    }
}
