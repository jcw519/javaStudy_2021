package reservationsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void reservationSystemRun(Scanner scanner, ArrayList<Seat[]> seatGradeList) {
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        
        while(true) {
            System.out.print("예약:1  조회:2  취소:3  끝내기:4  >>");
            int input = scanner.nextInt();
            if(input == 1){
                reservation(scanner, seatGradeList);
            } else if(input == 2){
                inquiry(scanner, seatGradeList);
            } else if(input == 3){
                cancellation(scanner, seatGradeList);
            } else if(input == 4){
                System.out.println("예약 시스템을 종료하겠습니다.");
                return;
            } else {
                continue;
            }
        }
    }
    
    
    
    
    
    public static void reservation(Scanner scanner, ArrayList<Seat[]> seatGradeList) {
        int seatGradeIndex;
        String seatSubscriber;
        int seatNumber;
        
        while(true) {
            System.out.print("좌석구분 :");
            for(int i = 0; i < seatGradeList.size(); i++){
                System.out.print(seatGradeList.get(i)[0].getSeatGrade() + "(" + (i+1) + ")  ");
            }
            System.out.print(">>");
        
        
        
            seatGradeIndex = scanner.nextInt() - 1;
            showSeatList(seatGradeIndex, seatGradeList);


            scanner.nextLine();        
            System.out.print("이름>> ");
            seatSubscriber = scanner.nextLine();

            System.out.print("좌석번호>> ");     
            seatNumber = scanner.nextInt() - 1;

            if(seatGradeList.get(seatGradeIndex)[seatNumber].getSeatSubscriber() == null) {
                seatGradeList.get(seatGradeIndex)[seatNumber].setSeatSubscriber(seatSubscriber);
                break;
            } else {
                System.out.println("예약된 자리입니다. 다른 자리를 선택해 주십시오");
                continue;
            }
        }
        
    }
    
    
    
    
    
    public static void inquiry(Scanner scanner, ArrayList<Seat[]> seatGradeList) {
        for(int i = 0; i < seatGradeList.size(); i++){
            showSeatList(i, seatGradeList);
        }
        System.out.println("<<조회를 완료했습니다.>>");
    }
    
    
    
    
    
    
    public static void cancellation(Scanner scanner, ArrayList<Seat[]> seatGradeList) {
        
    }
    
    
    public static void showSeatList(int seatGradeIndex, ArrayList<Seat[]> seatGradeList) {
        System.out.print(seatGradeList.get(seatGradeIndex)[0].getSeatGrade()+">> ");
        for(int i = 0; i < seatGradeList.get(seatGradeIndex).length; i++){
            if(seatGradeList.get(seatGradeIndex)[i].getSeatSubscriber() == null){
                System.out.print("--- ");
            } else {
                System.out.print(seatGradeList.get(seatGradeIndex)[i].getSeatSubscriber() + " ");
            }
        }
        System.out.println();
    }
      
}
