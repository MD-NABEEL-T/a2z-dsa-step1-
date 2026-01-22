import java.util.*;
public class Alright {
    public static void main(String []args){
        List<Integer> al=new ArrayList<>();
        al.add(3);
        al.add(2);
        al.add(4);
        System.out.println(Collections.min(al));
        System.out.println(Collections.max(al));

        System.out.println(al);
        
        Collections.reverse(al);
        System.out.println(al);
        
        Collections.sort(al);
        System.out.println(al);

        al.add(3);
        System.out.println(al);
        System.out.println(Collections.frequency(al,3));

        // Math.pow(0, 0);
    }
}
