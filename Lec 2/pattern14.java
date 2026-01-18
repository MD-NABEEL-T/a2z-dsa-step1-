public class pattern12{
    public static void main(String []args){
        int n=5;
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

// this will also work
        // for(int i=1;i<=5;i++){
        //     char ch='A';
        //     for(int j=1;j<=i;j++){
        //         System.out.print(ch);
        //         ch ++;
        //     }
        //     System.out.println();
        // }