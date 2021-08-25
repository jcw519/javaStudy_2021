package scheduler;

import java.io.IOException;

public class SchedulerTest {
    
    public static void main(String[] args) {
        Scheduler scheduler = null;
        System.out.println("전화 상담원 할당 방식을 선택하세요");
        System.out.println("R : 한명씩 차례대로");
        System.out.println("L : 대기가 적은 상담원 우선");
        System.out.println("P : 우선순위가 높은 고객우선 숙련도 높은 상담원");
        
        try{
            int ch = System.in.read();
            

            if(ch == 'R' || ch == 'r') {
                scheduler = new RoundRobin();
            } else if (ch == 'L' || ch == 'l'){
                scheduler = new LeastJob();
            } else if (ch == 'P' || ch == 'p'){
                scheduler = new PriorityAllocation();
            } else {
                System.out.println("지원되지 않는 기능입니다.");
                return;
            }
            
        } catch (IOException e) {
            System.out.println("입력오류");
        }
        
        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}
