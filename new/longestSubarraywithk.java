import java.util.*;
// [1,2,2,3,4,100,200]
// better solution O(n)logn + O(n)
class longestSequencearr {
    public static void main(String []args){
        int nums[]={0,1,1,2,434,434,435};
        Arrays.sort(nums);
        int i=1;
        int max=0;
        int count=1;
        if(nums.length==1){return 1;}
        while(i<nums.length){
            
            if(nums[i]==nums[i-1]){
                i++;
            }
            else if(nums[i]==nums[i-1]+1){
                count++;
                i++;
            }
            else{
                count=1;
                i++;
            }
            
            if(max<count){
                max=count;
            }
        }
        
        return max;
    }
}