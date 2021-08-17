package objectarray;

public class Book {
    private String title, author;
    
    public Book(String title, String author) {
        if(title == "") {
            this.title = "제목없음";
        } else {
            this.title = title;
        } 
        
        if(author == ""){
            this.title = "작자미상";
        } else {
            this.author = author;
        }      
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
}
