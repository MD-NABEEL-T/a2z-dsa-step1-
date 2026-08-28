public class pattern17{
    public static void main(String []args){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            char ch='A';
            for(int j=0;j<2*i+1;j++){
                System.out.print(ch);
                if(j<i) ch++;
                else ch--;
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    static void demo(){
        int n=5;
        for(int i=1;i<=n;i++){
            char ch1='A';
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j<i){
                    System.out.print(ch1++);
                }
                else{
                    System.out.print(ch1--);
                }
            }
            System.out.println();

        }
        }
    
}