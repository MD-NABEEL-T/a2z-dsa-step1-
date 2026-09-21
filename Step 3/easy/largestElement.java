public class largestElement{
    public static void main(String[] args) {
        int arr[]={20,10,5,25,30};
        int largest=0;
        for(int i=1;i<arr.length-1;i++){
            if(largest < arr[i]){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
