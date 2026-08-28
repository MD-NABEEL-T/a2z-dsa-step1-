public class pattern13{
    public static void main(String []args){
        int n=5;
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+ " ");
                k++;
            }
            System.out.println();
        }
    }


    static void demo(String[] args) {
        int count=1;
        int n=4;
        for(int i=0;i<=4;i++){
            for(int j=0;j<=i;j++){
                //count++ prints and then increases the value so it is right
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}