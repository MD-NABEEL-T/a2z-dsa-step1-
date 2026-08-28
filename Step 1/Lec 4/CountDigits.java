//Time complexxity is O(log10(N))

import java.util.*;
public class CountDigits {

    // here we use Integer because cannot invoke primitive toString();
    public static void myMethod(Integer n){
        String s=n.toString();
        System.out.println(s.length());
    }
    public static void anotherWay(int n)
    {
        int ct=0;
        while(n>0){
            n=n/10;
            ct++;
        }
        System.out.println(ct);
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number bhai");
        int n=sc.nextInt();
        myMethod(n);
        anotherWay(n);
        sc.close();
    }
}
