// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         int n=nums.length;
//         int pos[]=new int[n/2];
//         int neg[]=new int[n/2];

//         int poscount=0;
//         int negcount=0;
//         for(int i=0;i<n;i++){
//             if(nums[i]>0){
//                 pos[poscount]=nums[i];
//                 poscount++;
//             }
//             else if(nums[i]<0){
//                 neg[negcount]=nums[i];
//                 negcount++;
//             }
//         }
//         poscount=0;
//         negcount=0;
//         for(int i=0;i<n;i++){
//             if(i%2==0){
//                 nums[i]=pos[poscount];
//                 poscount++;
//             }
//             else{
//                 nums[i]=neg[negcount];
//                 negcount++;
//             }
//         }
//         return nums;
//     }
// }

class Solution{
    public int[] rearrangeArray(int[] nums) {
        int j=0;
        int k=1;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                arr[k]=nums[i];
                k=k+2;
            }
            else if(nums[i]>0){
                arr[j]=nums[i];
                j=j+2;
            }
        }
        return arr;
    }
}