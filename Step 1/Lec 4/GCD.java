// GCD or HCF.
//revise this again.
public class GCD {
    // Time Complexity is O(min(n1,n2))
    public static int HCF1(int n1,int n2){
        int minimum=Math.min(n1,n2);
        for(int i=minimum;i>0;i--){
            if(n1%i==0 && n2%i==0){
                    return i;
            }
        }
        return 1;//if not used java vm shows fallback error 
    }
    public static int HCF2(int n1,int n2){
        int new1=Math.min(n1,n2);
        int new2=Math.max(n1,n2);
        for(int i=new2-new1;i>0;i--){
            if(n1%i==0 && n2%i==0){
                return i;
            }
        }
        return 1;
    }
    // EUCLIDEAN ALGORITHM 
    //Math formula gcd(a,b)= gcd(a - b,b) where a>b.
    // eg : gcd(20,15) = gcd(5,15) .
    //TC is O(log(N))
    public static int HCF3(int a,int b){
        while(a>0&&b>0){
            if(a>b)a=a%b;
            else b=b%a;
        }
        if(a==0) return b;
        else return a;
    }

    public static void main(String[] args) {
        int n1=20;
        int n2=40;
        
        //brute force
        int highestFactor=HCF1(n1,n2);
        int highestFactor2=HCF2(n1,n2);

        //best approach
        int greatestCommonDivisor=HCF3(n1,n2);
        System.out.println(highestFactor);
        System.out.println(greatestCommonDivisor);
    }
}