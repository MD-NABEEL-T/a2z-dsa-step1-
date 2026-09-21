class Solution {   
    public boolean palindromeCheck(String s) {
        //your code goes here
        int j=s.length();
        for(int i=0;i<=j/2;i++){
            j--;
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}