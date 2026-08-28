import java.util.*;
// sorted order
public class TreeMap1 {
    public static void main(String []args){
        TreeMap<Integer,String> hm=new TreeMap<>();
        hm.put(20,"nabeel");
        hm.put(10,"Thr");
        //Map doesnt allow duplicate keys 
        hm.put(20,"tmn");
        System.out.println(hm);
        System.out.println(hm.floorKey(15));
        System.out.println(hm.ceilingKey(15));
        System.out.println(hm.keySet());
    }
}
