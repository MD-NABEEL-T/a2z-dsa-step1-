// MERGE SORT - DIVIDE AND CONQUER 
// TC = O(n log n);
// SC = O(1);

/**
 * ps4
 */
import java.util.*;
public class ps4 {
    static void merge(int arr[],int low,int mid,int high){
        List<Integer> temp = new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }
    static void mergeSort(int arr[],int low, int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void main(String[] args) {
        int arr[]={24,10,8,3,5,1};
        int n=arr.length;
        mergeSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
}