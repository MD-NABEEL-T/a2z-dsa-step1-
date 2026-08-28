public class Recursion1{
    public static void f(int countt){
        if(countt>3)    return;
        else{
            System.out.println(countt);
            countt++;
            f(countt);
        }
    }
    public static void main(String []args){
        f(0);
    }
}