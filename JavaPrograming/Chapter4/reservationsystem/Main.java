package reservationsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {  
        
        Seat[] seatA = Seat.makeSeatList(11, "A");
        Seat[] seatB = Seat.makeSeatList(12, "B");
        Seat[] seatC = Seat.makeSeatList(18, "C");
        Seat[] seatS = Seat.makeSeatList(19, "S");
        
        ArrayList<Seat[]> seatGradeList = new ArrayList<Seat[]>();
        seatGradeList.add(seatA);
        seatGradeList.add(seatB);
        seatGradeList.add(seatC);
        seatGradeList.add(seatS);
        
        Scanner scanner = new Scanner(System.in);
        
        Menu.reservationSystemRun(scanner, seatGradeList);
      
        
    }
}
