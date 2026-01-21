import java.util.*;
//FIFO
public class ArrayDeque1 {
    public static void main(String []args){
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        ad.offer(3);
        ad.offer(0);
        System.out.println(ad);
        System.out.println(ad.peek());
        ad.offer(4);
        ad.poll();
        System.out.println(ad);
    }    
}
