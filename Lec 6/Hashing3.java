/**
 * Hashing3
 * tby i wrote this and it works but i dont know how 
 */
public class Hashing3 {

    public static void main(String[] args) {
        String s="hello";

        //since there is only 26 alphabets right
        int arr[]=new int[26];
        int count=0;
        char key='l';
        for(int i=0;i<s.length();i++){
            int x=s.charAt(i)-'a';
            arr[x]=x;
            if((int)(key-'a')==x){
                count++;
            }
        }
        System.out.println(count);
    }
}