/**
 * BUBBLE SORT - compare next element and swap until the max num goes to the last
 * ps2
 * 
 * isSwapped is used to reduce the time complexity from 0(n2) to 0(n) by breaking after an inner loop executes knowing that if no swap happened 
 */
import java.util.*;
public class ps2 {

    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        int n=arr.length;
        for(int i=0;i<n;i++){
            int k=0;
            boolean isSwapped=false; 
            for(int j=1;j<n-i;j++){
                if(arr[k]>arr[j]){
                    int temp=arr[k];
                    arr[k]=arr[j];
                    arr[j]=temp;
                    k++;

                    isSwapped=true;
                }
                else{
                    k++;
                }
            }
            if(!isSwapped){break;}
        }
        System.out.println(Arrays.toString(arr));
    }
}