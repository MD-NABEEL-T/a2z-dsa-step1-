/**
 * LongestSequenceWithK
 * A subarray must contain contiguous (adjacent) elements in their original order. For example, if arr = [10, 5, 2, 7, 1, 9] and k = 15, [5, 2, 7, 1] sums to 15 and has length 4, not the [10,5] with length 2.
 * they will give you the target and based on that you have to find the longest subarray
 * in this question they are asking length of longest subarray
 * [1,2,3,1,1,1,4,2,3]
*/
import java.util.*;
public class LongestSequenceWithK {
    public static void main(String[] args) {
        // brute force O(n^2) T.C
        // int nums[]={10,5,2,7,1,9};
        // int target=15;
        // int max_count=0;
        // for(int i=0;i<nums.length;i++){
        //     int val=0;
        //     int count=0;
        //     for(int j=i;j<nums.length;j++){
        //         val+=nums[j];
        //         count++;
        //         if(val==target){
        //             if(max_count<count){max_count=count;}
        //             break;
        //         }
        //     }
        // }
        // System.out.println(max_count);








        // better solution for only positive numbers 
        // Optimal Solution for negative and zeroes and positive
        // int nums[]={10,5,2,7,1,9};
        // int target=15;
        // int sum=0;
        // int maxlen=0;
        // Map<Integer,Integer> map=new HashMap<>();
        
        // for(int i=0;i<nums.length;i++){
        //     sum+=nums[i];
        //     // case 1
        //     if(sum==target){
        //         maxlen=i+1;
                
        //     }

        //     int needed=sum-target;
        //     if(map.containsKey(needed)){
        //         int len=i-map.get(needed);
        //         if(maxlen<len){maxlen=len;}
        //     }

        //     if(!map.containsKey(sum)){
        //         map.put(sum, i);
        //     }
        //  

         // map.putifAbsent(sum,i);
        // }

        // System.out.println(maxlen);














        // optimal solution using sliding window.
        // int nums[]={10,5,2,7,1,9};
        // int nums[]={1,2,3,1,1,1,1,3,3};
        // int target=15;
        // int left=0;
        // int right=0;
        // long sum=0;
        // int maxLen=0;

        // while(right<nums.length){
        //     while(left<=right && sum >target){
        //         sum-=nums[left];
        //         left++;
        //     }
        //     if(sum==target){
        //         maxLen=Math.max(maxLen, right - left+1);
        //     }
        //     right++;
        //     if(right<nums.length)sum+=nums[right];
        // }

        int nums[]={1,2,3,1,1,1,1,3,3};
        int k=6;// target, and to find max length
        int left=0;
        long sum=0;
        int max_length=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>k && left<=right){
                sum-=nums[left];
                left++;
            }
            if(sum==k){
                int length=right-left+1;
                max_length=Math.max(max_length,length);
            }

        }
        System.out.println(max_length);
    }
}