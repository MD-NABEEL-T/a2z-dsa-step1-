import java.util.*;
class rearrangeelementsbysign2{
    public static void main(String []args){
        int nums[]={-1,2,3,4,-3,1};
        int n=nums.length;
        int result[]=new int[n];
        List<Integer> list1=new ArrayList<>();// Negative 
        List<Integer> list2=new ArrayList<>();// Positive
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                list1.add(nums[i]);
            }
            
            else if(nums[i]>0){
                list2.add(nums[i]);
            }
        }

        int j=0;
        int k=0;
        int counter=0;
        boolean toggle=true;
        while(j<list1.size() && k<list2.size()){
            if(toggle){
                result[counter++]=list1.get(j++);
                toggle=false;
            }
            else{
                result[counter++]=list2.get(k++);
                toggle=true;
            }
        }
        while(j<list1.size()){
            result[counter++]=list1.get(j++);
        }
        while(k<list2.size()){
            result[counter++]=list2.get(k++);
        }
        System.out.print(Arrays.toString(result));
    }
}