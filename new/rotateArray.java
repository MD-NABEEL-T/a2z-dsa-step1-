import java.util.*;
public class rotateArray{

    public static void main(String args[]){
        int arr[]={10,20,30,40,50,60,70};
        int k=3;
        int j=k;
        for(int i=0;i<=arr.length-k;i++){
            if(j==arr.length){
                j=j-arr.length;
            }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;
        }
        System.out.print(Arrays.toString(arr));
    }
}