/**
 * Hashing2
 * input 
 * given array has 2 1 2 3 1
 * then find how many times a particular element appears in the array ; 
 */
import java.util.*;
public class Hashing2 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter array n");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter array values");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } 
        System.out.println("Array" + '\n' + Arrays.toString(arr));

        // to know the times it has been repeated 

        System.out.println("Enter the value you want to find how many times it appeared in array");
        int count=0;
        int key=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==key) count++;
        }
        System.out.println(count);
    }
}