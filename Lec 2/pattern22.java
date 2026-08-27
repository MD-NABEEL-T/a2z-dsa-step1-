public class pattern22{
    public static void main(String []args){
        int n=4;
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                if(i==1||i==2*n-1||j==1||j==2*n-1)//here we write 2*n-1 since we loop for 7 times,this applies for below also 
                {
                    System.out.print(4+" ");
                }
                else if(i==2||i==(2*n-1-1)||j==2||j==(2*n-1-1)){
                    System.out.print(3+" ");
                }
                else if(i==3||i==(2*n-2-1)||j==3||j==(2*n-2-1)){
                    System.out .print(2+" ");
                }
                else{
                    System.out.print(1+" ");
                }
            }
            System.out.println();
        }
    }                    
}