import java.util.*;
public class PriorityQueue1 {
    // PRIORITY QUEUE IS MIN HEAP
    public static void main(String []args){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.offer(2);
        pq.offer(1);
        pq.offer(5);
        pq.offer(3);

        System.out.println(pq);
        // peek() here prints the smallest number 
        System.out.println(pq.peek());
        pq.poll();
        // poll() removes the smallest number here
        System.out.println(pq.peek());

        System.out.println(pq);
        // TO PRINT THE ASCENDING ORDER 
        while(pq.isEmpty()==false){

            System.out.println(pq.peek());
            pq.poll();
            
        }
    }   
}
