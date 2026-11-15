// optimized code 
//sieve of enasthosis something like that
import java.util.*;
public class countPrimesL2{
    public static void main(String []args){
        int prime[]=new int[30];
        Arrays.fill(prime,1);
        // System.out.println(Arrays.toString(arr));
        for(int i=2;i<prime.length;i++){
            if(prime[i]==1){
                for(int j=2*i;j<prime.length;j+=i)
                    {
                    prime[j]=0;
                }
            }
        }
        for(int i=2;i<prime.length;i++){
            if(prime[i]==1){
                System.out.println(i);
            }
        }
    }
}

// Let's say i = 3 and prime.length = 30.
// Step-by-step execution
// Step 1: Initialize j
// int j = 2 * i;


// Since i = 3, j = 2 * 3 = 6.
// Update j
// j += i;

// This means j = j + i, so j = 6 + 3 = 9.
// The loop repeats.