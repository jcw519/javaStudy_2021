package hiding;

public class MyDate {
    
    //아무것도 안 쓰는 경우(기본 접근제어자) : 같은 패키지내에서 참조가능
    //다른 패키지에서도 접근을 허용하려면 public 사용
    //private을 사용하면 클래스 외부에서는 접근할 수 없음
    private int day;
    private int month;
    private int year;
    
    //boolean의 기본값은 false
    private boolean isValid = true;
    
    public void setDay(int day) {
        this.day = day;
    }
    
    public int getDay() {
        return day;
    }
    
    public void setMonth(int month) {
        if(month < 1 || month > 12){
            isValid = false;
        }
        else {
            this.month = month;    
        }
        
    }
    
    public int getMonth() {
        return month;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public int getYear() {
        return year;
    }
    
    public void showDate() {
        if(isValid){
            System.out.println( year + "년 " + month + "월 " + day + "일 입니다.");
            
        } else {
            System.out.println("유효하지 않은 날짜 입니다.");
        }
        
        
    }
}
