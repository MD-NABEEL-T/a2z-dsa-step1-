// PRINT SUM OF N USING RECURSION
public class Recursion6 {
    public static void my(int i,int n){
        if(n<1) 
            {
            System.out.println(i);
            return;
            }
        i=n+i;
        my(i,n-1);
    }
    public static void main(String []args){
        int n=3;
        my(0, n);

        //pa
        par()
    }
}
