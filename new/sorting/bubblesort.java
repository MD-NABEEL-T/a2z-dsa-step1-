import java.util.Arrays;

public class bubblesort{
    public static void main(String []args){
        int arr[]={13,46,24,52,20,9};
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            // i-1 because the last element should not be compared to the next element.
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1] ){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}