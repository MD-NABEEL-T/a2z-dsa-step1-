public class demo {
    //print sum of n using recursion 
    static void f(int i,int n){
        if(i<1){
            return;
        }
        else{
            f(i-1,n);
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int n=5;
        f(n,n);
    }
}
