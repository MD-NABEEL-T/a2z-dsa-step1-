// FIBONACCI SERIES 
import java.util.*;
public class Recursion10 {
    public static void fib(int i,int n,int a,int b,ArrayList<Integer> al){
        if(i>n){
            System.out.println(al);
            return ;}
        al.add(a);
        fib(i+1,n,a+b,a,al);
    }

    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        int i=1;
        int n=10;
        fib(i,n,0,1,al);
    }
}

// normal for loop
// int a = 0;
// int b = 1;
// for(int i = 1; i <= n; i++) {
//     System.out.print(a + " ");
    
//     int temp = a + b;
//     a = b;
//     b = temp;
// }
