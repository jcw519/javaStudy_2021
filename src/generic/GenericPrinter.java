package generic;

public class GenericPrinter<T extends Material> { 
    //extends키워드로 T 대신에 사용될 자료형을 제한하기 위해 사용한다.
    //Material에 정의 된 메서드를 공유할 수 있음.
    
    private T material;
    
    public T getMaterial(){
        return material;
    }
    
    public void setMaterial(T material) {
        this.material = material;
    }
    
    public String toString() {
        return material.toString();
    }
    
    public void printing(){
        material.doPrinting();
    }
}
