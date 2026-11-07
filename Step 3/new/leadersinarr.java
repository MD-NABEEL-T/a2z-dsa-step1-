import java.util.*;
public class leadersinarr{
    public static void main(String []args){// leader is an element whose value is greater than its corresponding right values.
        int nums[]={1,2,5,1,3,2};
        List<Integer> list=new ArrayList<>();

        // for(int i=0;i<nums.length;i++){
        //     boolean leader=true;
        //     for(int j=0;j<nums.length;j++){
        //         if(arr[i]<arr[j]){
        //             leader=false;
        //             break;
        //         }
        //     }
        //     if(leader==true){
        //         list.add(nums[i]);
        //     }
        // }

        int max=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){

            if(nums[i]>max){
                max=nums[i];
                list.add(max);
            }
        }
        System.out.print(list);

    }
}