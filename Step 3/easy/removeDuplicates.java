// Remove duplicates from a sorted array
// BRUTE FORCE METHOD
import java.util.*;
public class removeDuplicates{
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,3};
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int j=0;
        for(int itr : set){
            arr[j]=itr;
            j++;
        }
        
        // optional if need to fil
        // while(j<arr.length){
        //     arr[j]=0;
        //     j++;
        // }
        System.out.println(Arrays.toString(arr));
        System.out.println("sorted array Length:"+j);
    }
}