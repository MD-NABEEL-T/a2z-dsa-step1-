public class pattern10{
    public static void main(String []args){
        int n=5;
        int stars;
        for(int i=1;i<=2*n-1;i++){
            // since it is only one graph cant be divided as two means NO SYMMETRY so only 
            if(i<n) stars=i;
            else stars=2*n-i;
            
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}