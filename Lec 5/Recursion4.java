// PRINT FROM 1-n USING RECURSION (BACKTRACKING)
public class Recursion4{
    public static void f(int i,int n){
        if(i==0)    return;
        f(i-1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int n=4;
        f(n,n);
    }
}