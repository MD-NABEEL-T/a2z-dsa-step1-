import java.util.*;
public class reverseString{
    public static void main(String []args){
        char ch[]={'h','e','l'};
        int i=0;
        int j=ch.length-1;
        while(i<j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(ch));
    }
}