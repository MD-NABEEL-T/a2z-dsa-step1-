
/**
 * alright so insertionsort does insert the array it is like 
 * {7, 4, 1, 5, 3}
 * {4, 7, 1, 5, 3}
 * {1, 4, 7, 5, 3}
 * like that it does so 
 * recursiveinsertionsort
 */
public class recursiveinsertionsort {
    static void recursiveSort(int arr[],int l,int r){
        int n=arr.length-1;
        if(r==n){return ;}
        
        r++;
    }
    public static void main(String[] args) {
        int nums[]={7, 4, 1, 5, 3};
        recursiveSort(nums,0,1);
    }
}