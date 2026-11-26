public class countinversions{
        static int counter=0;
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
                // here i>j 
                counter+=(mid-left+1);
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
        // countInversions(arr,low,mid,high);
        merge(arr,low,mid,high);

    }

    public static void main(String []args){
        int nums[]={ 5 , 3 , 2 , 4 , 1 };
        // i<j  
        // nums[i]>nums[j]
        // brute force
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
        }
        System.out.println(count);

        mergeSorting(nums, 0, nums.length-1);
        // here only one line of addition tthat is counter aside from the merge sort and the magic happens
        System.out.println(counter);
    }
}
