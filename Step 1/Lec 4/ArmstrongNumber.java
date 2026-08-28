public class ArmstrongNumber{
    public static void main(String []args){
        int x=371;
        int n=x;
        int lastDigit=0,cubeNum=0;
        while(n>0)
        {
            lastDigit=n%10;
            n=n/10;
            cubeNum=cubeNum+(lastDigit*lastDigit*lastDigit);
        }
        if(x==cubeNum){System.out.println(true);}
        else{System.out.println(false);}
        
    }
}