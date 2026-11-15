// longest common prefix 
// Input: strs = ["flower","flow","flight"]
// Output: "fl"

import java.util.*;
public class lcp{
    public static void main(String []args){
        String strs[]={"flower","flow","flight"};
        String ans="";
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        for(int i=0;i<first.length();i++){
            if(first.charAt(i)==last.charAt(i)){
                ans+=first.charAt(i);
            }
            else{
                break;
            }
        }
        System.out.println(ans);
    }
}