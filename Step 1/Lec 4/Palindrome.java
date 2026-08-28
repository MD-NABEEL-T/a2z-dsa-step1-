public class Palindrome {
    public static void main(String []args){
        int x=23455432;
        int n=x;
        int lastDigit=0,revNum=0;
        while(n>0){
            lastDigit=n%10;
            n=n/10;
            revNum=(revNum*10)+lastDigit;
        }
        if(revNum==x) System.out.println(true);
        else System.out.println(false);
    }
}
