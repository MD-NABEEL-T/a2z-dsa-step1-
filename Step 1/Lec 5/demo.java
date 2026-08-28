// Recursion 
// How it returns values:	Parameterized / Functional
// What it's used for:	Plain recursion / Backtracking (try-undo-try)
import java.util.*;
public class demo {
    //print sum of n using recursion parameterized way
    static void f(int i,int sum){
        if(i<0){
            System.out.println(sum);
            return ;
        }
        else{
            f(i-1,sum+i);
        }
    }

    //print factorial of n using recursion functional way
    static int e(int i){
        if(i==0)return 1;
        else{
            return i*e(i-1);
        }
    } 

    //using two arrays find reverse array
    static void g(int i,int n,int arr1[],int arr2[]){
        if(n<0){
            System.out.println(Arrays.toString(arr2));
            return;
        }
        else{

            arr2[i]=arr1[n];
            g(i+1, n-1, arr1, arr2);
        }
    }

    //using two pointer find reverse array
    static void h(int i,int n,int arr[]){
        if(i>=n){
            System.out.println(Arrays.toString(arr));
            return;}
        else{
            int temp=arr[i];
            arr[i]=arr[n];
            arr[n]=temp;
            h(i+1,n-1,arr);
        }
    }
    
    //palindrome using twopointer recursion
    static void j(int i,int n,String s){
        if(i>=n){System.out.println("Palindrome");return;}
        else{
            //use == not .equals() because character is a primitive 
            if(s.charAt(i)==(s.charAt(n))){
                j(i+1,n-1,s);
            }
            else{
            System.out.println("Not a Palindrome");
            return;
            }
        }
    }
    
    //fibonacci using recursion 
    static void M(int i,int a,int b,int c){
        if(i<=0){return;}
        else{
            System.out.print(a +" ");
            c=a+b;
            a=b;
            b=c;
            M(i-1,a,b,c);
        }
    }
    public static void main(String[] args) {
        int n=5;
        // f(5,0);

        // System.out.println(e(n));

        // int arr1[]={10,20,30};
        // int arr2[]=new int[arr1.length];
        // g(0,arr1.length-1,arr1,arr2);

        // int arr[]={2,4,5,5};
        // h(0,arr.length-1,arr);
    
        // M(n,0,1,0);
        
    }
}
