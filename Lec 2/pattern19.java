public class pattern19{
    public static void main(String []args){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            for(int j=0;j<i*2;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            // for below
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<2*n-2*i-2;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// i did this brick by brick 

class demo{
    public static void main(String[] args) {
    int n=5;
    int m=0;
    int k=0;
    for(int i=1;i<=2*n;i++){
        // star
        if(i<=n)m=n-i+1;
        else if(i>n)m=i-n;

        for(int j=1;j<=m;j++){
            System.out.print("*");
        }
        
        //space
        if(i<=n)k=2*i-1;
        else if(i>n) k=2*(n*2-i)+1;//+1 is because j<k not j<=k , we use j<k because to eliminate the first one space till n
        for(int j=1;j<k;j++){
            System.out.print(" ");
        }

        //stars 

        for(int j=1;j<=m;j++){
            System.out.print("*");
        }
        
        System.out.println();
    }
    }
}