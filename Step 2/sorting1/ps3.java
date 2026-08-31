/**
 * INSERTION SORT - compare next index ,sort it and move to the next index and compare itwith the sorted 
 * ps3
 */
import java.util.*;
public class ps3 {

    public static void main(String[] args) {
        int arr[]={14,9,15,6,8};
        int n=arr.length;
        // int k=0;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

// best case = o(n);
// worst case=o(n2);