public class pattern11{
    public static void main(String []args){
        int n=5;
        int value=1;
        for(int i=1;i<=n;i++){
            if(i%2==0) value=0;
            else value=1;
            for(int j=1;j<=i;j++){
                System.out.print(value);
                value=1-value;
            }
            System.out.println();
        }
    }
}