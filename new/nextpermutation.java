//[ 2 1 5 4 3 0 0 ]
// step 1:
//  find the next biggest number right side likee 
//  here 1 is the only one that has 
//  nums[i]<nums[i+1]

// step 2:
// find element just next greater than 1 is 3
// so it becomes [2 3 ...]

// step 3:
// find the smallest number sequence next so sort it
// so it becomees [ 2 3 0 0 1 4 5]

// edge cases 
// [5 4 3 2 1]
class Solution {
    void swap(int nums[],int i,int j){

            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;

    }

    public void nextPermutation(int[] nums) {
        int index=-1;
        int n=nums.length;
        //no comparison for last element(n-1 th element) so n-2
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        // if [ 5 4 3 2 1]
        
        if(index==-1){
            for(int i=0;i<n/2;i++){
                swap(nums,i,n-i-1);
            }
            return ;
        }

        for(int i=n-1;i>=index;i--){
            if(nums[i]>nums[index]){
                swap(nums,i,index);
                break;
            }
        }

        // [2 1 5 4 3 0 0 ] to [ 2 3 5 4 1 0 0 ]
        // from 5 4 1 0 0 -> 0 0 1 4 5
        // since we know that after swap the remaining elements from the index just needs to be reversed right
        int j=index+1;
        int k=nums.length-1;
        while(j<k){
            int temp=nums[j];
            nums[j]=nums[k];
            nums[k]=temp;
            j++;
            k--;
        }

    }
}