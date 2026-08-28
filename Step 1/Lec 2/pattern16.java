public class pattern16{
    static void demo(){
        int n=5;
        char che='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(che);
            }
            che++;
            System.out.println();
        }  
    }
    public static void main(String []args){
        int n=5;
        char ch='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }
}