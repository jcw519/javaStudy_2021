package reservationsystem;

public class Seat {
    private int seatNumber;
    private String seatGrade;
    private String seatSubscriber = null;
    
    public Seat(String seatGrade, int seatNumber) {
        this.seatGrade = seatGrade;
        this.seatNumber = seatNumber;
    }
    
    public static Seat[] makeSeatList(int size, String seatGrade){
        Seat [] seat = new Seat[size];
        for(int i = 0; i < seat.length; i++){
            seat[i] = new Seat(seatGrade, i+1);
        }
        return seat;
    }
        
    public int getSeatNumber(){
        return seatNumber;
    }
    
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
    
    public String getSeatGrade(){
        return seatGrade;
    }
    
    public String getSeatSubscriber(){
        return seatSubscriber;
    }
    
    public void setSeatSubscriber(String seatSubscriber) {
        this.seatSubscriber = seatSubscriber;
    }
}
