//REVERSE AN ARRAy (TWO POINTER).
public class Recursion8 {
    public static void swap(int arr[],int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
    public static void reversing(int l,int r,int arr[]){
        if(l>=r)    
        {
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i] +" ");
            }
            return;
        }
        swap(arr,l,r);
        reversing(l+1,r-1,arr);
    }
    public static void main(String []args){
        int arr[]={1,5,7,3};
        reversing(0,arr.length-1,arr);
        //HERE ARRAY LENGTH IS 4 
    }
}
