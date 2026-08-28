public class PerfectNumber {
    // public static void usingExtraction()
    public static void main(String []args){
        int n=36;
        int divisors=0;
        // System.out.println("The divisor for "+n +"are :");
        for(int i=1;i<n;i++){
            if(n%i==0){
                // System.out.print(i+" , ");
                divisors=divisors+i;
            }
        }
        if(n==divisors) System.out.println(true);
        else System.out.println(false);
    }
}
// Example 1:

// Input: num = 28
// Output: true
// Explanation: 28 = 1 + 2 + 4 + 7 + 14
// 1, 2, 4, 7, and 14 are all divisors of 28.