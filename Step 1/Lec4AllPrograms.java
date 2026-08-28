import java.util.*;
public class Lec4AllPrograms {
    public static void main(String args[]){
    // Count Digit.
    //     int n=3456;
    //     int lastDigit=0;
    //     while(n>0){
    //         lastDigit++;
    //         n=n/10;
    //     }
    //     System.out.println(lastDigit);
    // 

    // Reverse a number
    // int n=345;
    // int lastDigit=0;
    // int revNum=0;
    // while(n>0){
    //     lastDigit=n%10;
    //     n=n/10;
    //     revNum=(revNum*10)+lastDigit;
    // }
    // System.out.println(revNum);

    //check palindrome
    //THE ABOVE PROGRAM CONTINUE
    // if(n==revNum)   {System.out.println("Palindrome");}
    // else            {System.out.println("Not a Palindrome");}

    // Check a prime
    // int n=41;
    // boolean pal=true;
    // for(int i=2;i*i<=n;i++){
    //     if(n%i==0){
    //         pal=false;
    //         break;
    //     }
    // }
    // if(pal) System.out.println("Palindrome");
    // else System.out.println("Not a Palindrome");

    // GCD 
    // int n1=20,n2=40;
    // int a=n1,b=n2;

    // while(a>0 && b>0){
    //     if(a>b) a=a%b;
    //     else    b=b%a;  
    // }

    // if(a==0){
    //     System.out.println(b);
    // }
    // else if(b==0){
    //     System.out.println(a);
    // }
    // else{
    //     System.out.println(0);
    // }

    //Print all divisors
    // int n=36;
    // TreeSet<Integer> tr=new TreeSet<>();
    //     // here use from 1 because it is also a divisor
    //     for(int i=1;i*i<=n;i++){
    //         if(n%i==0){
    //             tr.add(i);
    //             tr.add(n/i);
    //         }
    //     }
    //     System.out.println(tr);


    }
}
