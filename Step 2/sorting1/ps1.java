// SELECTION SORT
import java.util.*;
public class ps1{
//     public static void notgood(int arr ,int n){

//         int arr[]={23,12,3,45,53};
//         int n=arr.length;
//         for(int i=0;i<n-1;i++){
//             for(int j=i;j<n-1;j++){
//                 if(arr[j]<arr[i]){
//                     int temp=arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=temp;
//                 }
//             }
//         }
//         System.out.println(Arrays.toString(arr));
//     }
// }


    // public static void main(String []args){
    //     int arr1[]={12,34,5,23};

    //     // here len-1 is because oncce the last before number is sorted then the last number is also sorted right that's why 
    //     for(int i=0;i<arr1.length-2;i++){
 
    //         //assume minimum initially as 0.
    //         int minimum=i;

    //         //find the minimum by comparing
    //         for(int j=i;j<arr1.length-1;j++){
    //             if(arr1[i]>arr1[j]){
    //                 mimimum=j;
    //             }
    //         }

    //         // then swap the minimum value 
    //         int temp=arr1[i];
    //         arr1[i]=arr1[j];
    //         arr1[j]=temp;
            
    //     }
    //     System.out.println(Arrays.toString(arr1));
    // }


    public static void main(String []args){
        int arr[]={23,1,3,43,32};
        int min=0;
        int n=arr.length;

        // n-1 because if before last number is sorted then the last number is also sorted right 
        for(int i=0;i<n-1;i++){
            //to move to next when one number is sorted 
            min=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}