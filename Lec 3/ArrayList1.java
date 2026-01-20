import java.util.*;
public class ArrayList1 {
    public static void main(String []args){
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(59);
        aList.add(48);
        aList.add(23);
        System.out.println(aList);
        aList.remove(2);
        aList.add(1,38);
        System.out.println(aList);
        System.out.println(aList.get(1));
        System.out.println(aList.contains(59));
    }
}
