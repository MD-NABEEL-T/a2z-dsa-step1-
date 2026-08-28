/**
 * Hashing4
 */
import java.util.*;
public class Hashing4 {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,4,4,4,4,3,2,1};
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            // map.put(key,value)
            map.put(arr[i],map.getOrDefault(arr[i], (0))+1);

        }

        System.out.println(map);

        int greater = 0;
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > greater) {
                greater = entry.getValue();
            }
        }

        System.out.println(greater);
    }
}