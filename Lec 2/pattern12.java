// pattern noticed = 2*n-2*i;
// 1 6 1
// 2 4 2
// 3 2 3
// 4 0 4

public class pattern12{
    public static void main(String []args){
        int n=5;
        for(int i=1;i<=n;i++){
            // numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            // spaces
            for(int j=1;j<=2*n-2*i;j++){
                System.out.print(" ");
            }
            // numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}