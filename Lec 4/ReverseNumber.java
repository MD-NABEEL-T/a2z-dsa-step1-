import java.util.*;
public class ReverseNumber {
    public static void main(String []args){
        int n=234700;//7432
        int revNum=0;
        int lastDigit;
        while(n>0){
            lastDigit=n%10;
            n=n/10;
            revNum=revNum*10+lastDigit;
        }
    }
}
