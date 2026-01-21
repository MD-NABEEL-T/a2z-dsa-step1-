// JUST USE HASHSET 
// but when you want to use data in order then treeset is best.
import java.util.*;
public class TreeSet1 {
    public static void main(String []args){
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(32);
        ts.add(23);
        ts.add(-1);
        System.out.println(ts);
        for(Integer i:ts){
            System.out.println(i);
        }
        ts.add(45);
        ts.add(2);
        ts.add(5);
        System.out.println(ts);
        System.out.println(ts.floor(20));   //first value  <= 20 will print.
        System.out.println(ts.ceiling(20)); //first value  >= 20 will print.
    }
}
