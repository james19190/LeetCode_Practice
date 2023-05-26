class Solution {
    public boolean isPalindrome(int x) {
        String temp = String.valueOf(x);
        int length = temp.length();
        boolean pal = true;

        //if negative
        if (x<0) {return false;}
        
        for (int i = 0; i < length/2 ; i++){
             if (temp.charAt(i) != temp.charAt(length-i-1)){
                return false;
            }
        }
                
        return pal;
    }
}
