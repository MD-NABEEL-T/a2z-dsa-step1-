// PRINT FROM n-1 USING RECURSION (BACKTRACKING)
public class Recursion5{
    public static void f(int i,int n){
        if(i>n) return;
        f(i+1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int n=4;
        f(1,n);
    }
}