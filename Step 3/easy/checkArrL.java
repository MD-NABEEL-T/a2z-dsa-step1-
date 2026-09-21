class Solution {
    public boolean check(int[] nums) {
        int len = nums.length;
        int deviations=0;
        for(int i=0;i<len;i++){
            if(i<len-1 && nums[i]>nums[i+1] ){
                deviations=deviations+1;
            }
            //if i put (nums[i]> nums[i+1] && i<len-1)
            // then it is array out of bound exception
            else if(i==len-1 && nums[len-1]>nums[0]){
                deviations=deviations+1;
            }
        }
        
        if(deviations > 1) 
        {return false;}
        else {return true;}
    }
}