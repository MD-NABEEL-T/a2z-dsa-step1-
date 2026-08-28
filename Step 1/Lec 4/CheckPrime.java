// PRIME NUMBER -> A NUMBER THAT HAS ONLY TWO FACTOR 1 & ITSELF
public class CheckPrime {
    public static boolean method1(int n,boolean prime){
        if(n<=1){
            prime=false;
        }
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    prime=false;
                    break;
                }
            }
        }
        return prime;
    }
    public static boolean method2(int n){
        if(n<=1) return false;
        else{
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n=25;
        boolean prime=true;
        
        boolean result1=method1(n, prime);
        // here no need to pass prime as a parameter because true and false we can directly return right so only i have not passed in this method 2.
        boolean result2=method2(n);

        if(result1) System.out.println(n+" is a prime");
        else System.out.println(n+" is not a prime");  

        if(result2) System.out.println(n+" is a prime");
        else System.out.println(n+" is not a prime");   

    }
}
