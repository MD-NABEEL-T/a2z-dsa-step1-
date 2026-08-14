public class pattern10(imp){
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

 class demo {
    public static void main(String[] args) {
        int n=4;
        // int m=n;
        for(int i=1;i<=2*n;i++){
            if(i<=n){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            }
            else if(i>n){
                for(int j=1;j<=2*n-i;j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}