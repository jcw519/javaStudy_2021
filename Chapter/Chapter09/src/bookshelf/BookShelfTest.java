package bookshelf;

public class BookShelfTest {
    
    public static void main(String[] args) {
        //인터페이스 타입으로 선언 -> 인터페이스에 선언된 기능사용의 편리함을 위해
        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("태백산맥1");
        bookQueue.enQueue("태백산맥2");
        bookQueue.enQueue("태백산맥3");
        
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        
        
    }
}
