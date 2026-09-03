// RECURSIVE INSERTION SORT
import java.util.*;
public class ps7{
    static void recursiveInsertion(int arr[],int i,int n){
        if(i>n){return;}
        int low=0;
        int high=i;
        while(high<0){
            if(arr[high]<arr[high-1]){
                int temp=arr[high];
                arr[high]=arr[high-1];
                arr[high-1]=temp;
            }
            high--;
        }
        recursiveInsertion(arr,i+1,n);

    }
    public static void main(String []args){
        int arr[]={4,5,9,1,3};
        recursiveInsertion(arr,1,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}