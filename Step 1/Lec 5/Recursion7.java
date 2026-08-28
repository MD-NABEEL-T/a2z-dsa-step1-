// Factorial number
public class Recursion7 {
    public static int y(int n){
        if(n==0)
            return 1;
        
        return n*y(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(y(n));

    }
}
