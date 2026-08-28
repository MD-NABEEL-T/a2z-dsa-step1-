import java.util.*;
public class PrintDivisors {
    public static void method1(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void method2(int n){
        TreeSet<Integer> ar=new TreeSet<>();
        int sq=(int)Math.sqrt(n);
        for(int i=1;i<=sq;i++){
            if(n%i==0){
                    // System.out.print(i +" ");
                    ar.add(i);
                //if list is used 
                // if(n/i != i){
                //     // System.out.print(n/i +" ");
                //     ar.add(n/i);
                // }
                
                //if set is used it avoids duplicates
                //treeset is automatically sorted
                    ar.add(n/i);
            }
        }
        // Collections.sort(ar);
        //We did it bro !!!!!.
        System.out.println(ar);
    }
    public static void main(String []args){
        int n=36;
        System.out.println("The divisors of "+n);
        method1(n);
        method2(n);
    }
}
