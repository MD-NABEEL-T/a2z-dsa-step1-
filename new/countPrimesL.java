
// Which One Should You Use?

// • If you want it ordered based on how you insert it, switch to LinkedHashSet.
// • If you want it ordered element-wise (sorted A–Z or 1–10), switch to TreeSet.

public class countPrimesL{
    public static void main(String []args){
        int num=10;
        int countPrimes=0;
        for(int i=2;i<num;i++){
            boolean isPrime=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime=false;
                    break;}
            }
            if(isPrime==true){
                countPrimes++;
            }
        }
        System.out.println(countPrimes);
    }
}