package collection;

import java.util.ArrayList;

class myQueue {
    ArrayList<String> queue = new ArrayList<String>();
    
    public void enQueue(String data){
        queue.add(data);
    }
    
    public String deQueue(){
        int len = queue.size();
        if(len == 0){
            System.out.println("큐가 비었습니다.");
            return null;
        }
        return queue.remove(0);
    }
}

public class QueueTest {
    public static void main(String[] args){
        myQueue queue = new myQueue();
        
        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");
        
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        
    }
}
