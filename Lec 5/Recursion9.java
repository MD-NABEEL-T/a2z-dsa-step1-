//CHECK STRING IS PALINDROME OR NOT.

import java.lang.reflect.Method;

public class Recursion9 {
    public static boolean PalindromeName(int l,int r,String name){
        if(l>=r){
            return true;
        }
        // // the code below is not valid bcoz charAt() returns a char (primitive).
        // if(!(name.charAt(l).equalsTo(name.charAt(r)))){
        //     return false;
        // }
        if(name.charAt(l)!=name.charAt(r)){
            return false;
        }
        return PalindromeName(l+1,r-1,name);
        
    }
// ⚠ What If Method Was void?
// If the method was:
// public static void PalindromeName(...)
// Then yes — you wouldn’t need return.

// But since it returns boolean, you must return something.

// Final Clear Rule
// If method return type

    public static void main(String[] args) {
        String name="madam";
        boolean result=PalindromeName(0,name.length()-1,name);
        System.out.println(result);
 }    
}
