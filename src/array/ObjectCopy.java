package array;

public class ObjectCopy {
    
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];
        
        library[0] = new Book("태백산백1", "조정래");
        library[1] = new Book("태백산백2", "조정래");
        library[2] = new Book("태백산백3", "조정래");
        library[3] = new Book("태백산백4", "조정래");
        library[4] = new Book("태백산백5", "조정래");
        
        //얕은 복사 -> 주소만 복사 : 즉 하나의 인스턴스를 같이 가리키는 상태임
        System.arraycopy(library, 0, copyLibrary, 0, 5);
        
        
        
        //향상된 for문(advanced for) / for - each 문 : 배열의 모든 원소를 순차적으로 접근
        for(Book book : copyLibrary) {
            book.showBookInfo();
        }
        
        System.out.println("==================");
        
        library[0].setTitle("나목");
        library[0].setAuthor("박완서");
        
        for(Book book : library) {
            book.showBookInfo();
        }
        
        System.out.println("==================");
        
        for(Book book : copyLibrary) {
            book.showBookInfo();
        }
        
         System.out.println("==================");
        
        
        //깊은 복사
        //복사할 인스턴스를 따로 생성
        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();
        
        for(int i = 0; i < library.length; i++){
            copyLibrary[i].setTitle(library[i].getTitle());
            copyLibrary[i].setAuthor(library[i].getAuthor());
        }
        
        library[0].setTitle("날개");
        library[0].setAuthor("이상");
        
        for(Book book : library) {
            book.showBookInfo();
        }
        
        System.out.println("==================");
        
        for(Book book : copyLibrary) {
            book.showBookInfo();
        }
        
        
    }
}
