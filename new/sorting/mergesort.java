import java.util.*;
public class mergesort{
    static void merge2(int arr[],int low,int mid,int high){
        List<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<= mid && right <= high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){temp.add(arr[left]);left++;}
        while(right<=high){temp.add(arr[right]);right++;}
        // sorted temp array now put into the real array 

        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }
    static void merge(int arr[],int low,int mid,int high){
        int left=low;
        int right=mid+1;
        int k=0;
        int temp[]=new int[high-low+1];
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[k]=arr[left];
                left++;
            }
            else{
                temp[k]=arr[right];
                right++;
            }
            k++;
        }
        while(left<=mid){
            temp[k]=arr[left];
            left++;
            k++;
        }
        while(right<=high){
            temp[k]=arr[right];
            right++;
            k++;
        }

        for(int i=0;i<temp.length;i++){
            arr[low+i]=temp[i];
        }
    }
    static void mergeSorting(int arr[],int low,int high){
        if(low==high) {return;}

        int mid=(low+high)/2;
        mergeSorting(arr, low, mid);
        mergeSorting(arr,mid+1,high);
        merge(arr,low,mid,high);

    }
    public static void main(String []args){
        int arr[]={13,46,24,52,20,9};
        mergeSorting(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
}