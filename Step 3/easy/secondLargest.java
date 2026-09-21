public class secondLargest{
    public static void main(String[] args) {
        int arr[]={20,10,5,25,30};
        int largest=0;
        int secondLarge=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]> largest){
                secondLarge=largest;
                largest=arr[i];
            }
            else if(arr[i] < largest && arr[i] > secondLarge){
                secondLarge=arr[i];
            }
        }
        System.out.println(secondLarge);
    }
}