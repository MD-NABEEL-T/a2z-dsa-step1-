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