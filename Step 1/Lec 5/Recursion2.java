// PRINT NAME N TIMES USING RECURSION 
import java.util.*;
public class Recursion2 {
    public static void f(int i,int n){
        if(i>n) return;
        else{
            i++;
            System.out.println("Nabeel");
            f(i,n);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter number of times to print");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        f(1,n);
    }
}
