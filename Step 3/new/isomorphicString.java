import java.util.*;
public class isomorphicString{
    public static void main(String[] args) {
        String s="egg";
        String t="add";
        boolean result=isomorphic(s,t);
        System.out.println(result);
    }
    public static boolean isomorphic(String s,String t){
        HashMap<Character,Character> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                if(hm.get(s.charAt(i))==t.charAt(i)){
                    
                }
                else{
                    return false;
                }
            }
            
            else{
                if(!hm.containsValue(t.charAt(i))){
                    hm.put(s.charAt(i),t.charAt(i));
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}