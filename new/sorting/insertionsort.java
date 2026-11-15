import java.util.*;

public class insertionsort{

    public static void main(String []args){


        int arr[]={13,46,24,52,20,9};
      //it is like ------->
        //            <----
                   
        int n=arr.length;
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

