import java.util.*;
// the only difference in linked list when compared to arraylist is that it is double ended means can add,remove from both front and rear end.
public class LinkedList1{
    public static void main(String []args){
        LinkedList<Integer> li=new LinkedList<>();
        li.add(2);
        li.add(3);
        System.out.println(li);
        li.remove(1);
        System.out.println(li);
        li.addFirst(21);
        li.addLast(32);
        System.out.println(li);
        li.removeFirst();
        System.out.println(li);
        System.out.println(li.getFirst());
    }
}