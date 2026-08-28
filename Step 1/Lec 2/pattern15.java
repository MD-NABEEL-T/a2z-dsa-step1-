
public class pattern15{
    
    static void demo(){
        int n=5;
            for(int i=n;i>=1;i--){
            char ch='A';

            for(int j=1;j<=i;j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
    public static void main(String []args){
        int n=5;
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+n-i-1;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

        // for(int i=0;i<n;i++){
        //     char ch='A';
        //     for(int j=0;j<n-i;j++){
        //         System.out.print(ch);
        //         ch++;
        //     }