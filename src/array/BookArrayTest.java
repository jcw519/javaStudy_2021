package array;

public class BookArrayTest {
    
    public static void main(String[] args) {
        Book[] library = new Book[5];
        /*배열이 5개 생긴거지 책이라는 객체가 5개가 생긴건 아니다*/
        
        library[0] = new Book("태백산백1", "조정래");
        library[1] = new Book("태백산백2", "조정래");
        library[2] = new Book("태백산백3", "조정래");
        library[3] = new Book("태백산백4", "조정래");
        library[4] = new Book("태백산백5", "조정래");
        
        for(int i = 0; i < library.length; i++){
            System.out.println(library[i]);
            library[i].showBookInfo();
        }
    }
}
