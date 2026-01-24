public class ReverseNum {
    public static int reverseNumber(int n){
        int revNum=0,lastDigit=0;
        while(n>0){
            lastDigit=n%10;
            n=n/10;
            revNum=(revNum*10)+lastDigit;
        }
        return(revNum);
    }
    public static void main(String []args){
        int n=-439230;
        int result;
        if(n<0){
            n=-1*n;
            result =reverseNumber(n);
            result=-1*result;
        }
        else{
            result=reverseNumber(n);
        }

        System.out.println(result);
    }
}
// in leetcode you are converting it to long because of the question and while returning it you typecast it to int.