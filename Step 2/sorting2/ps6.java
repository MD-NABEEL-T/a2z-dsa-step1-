// RECURSIVE BUBBLE SORT
//  the main difference here is the recursive bubble sort has o(n) SC whereas the usual one's SC is o(1);
// but the tc is same for both 
import java.util.*;
public class ps6{
    static void recursiveBubbleSort(int []arr,int i,int n){

        if(n==1){
            return;
        }
        if(i==n){
            recursiveBubbleSort(arr,0,n-1);
        }
        else{
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        recursiveBubbleSort(arr,i+1,n);
        }

    }
    public static void main(String []args){
        int arr[]={4,6,2,5,7,1,9,3};
        recursiveBubbleSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}