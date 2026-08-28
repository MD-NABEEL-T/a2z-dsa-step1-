import java.util.*;
public class demo {
    public static void main(String []args){
        int nums[]={1,2,3,7};
        int target=10;

        boolean found=false;
        for(int i=0;i<nums.length&&found==false;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println(i+" "+j);
                    found=true;
                }
            }

        }
    }
}
