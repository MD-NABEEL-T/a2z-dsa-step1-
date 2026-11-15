import java.util.*;
class Solution {
    public void reverseString(List<Character> s) {
        //your code goes here
        List<Character> r=new ArrayList<>();
        int count=0;
        for(int i=s.size()-1;i>=0;i--){
            r.add(s.get(i));
        }
        s.clear();
        s.addAll(r);
        System.out.println(s);
        
    }
}