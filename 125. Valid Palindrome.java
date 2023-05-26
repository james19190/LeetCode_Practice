class Solution {
    public boolean isPalindrome(String s) {

        //REGULAR EXPRESSIOM
        String temp = s.toLowerCase().replaceAll("[^a-zA-Z0-9]," "");
        boolean palin = true;
        for (int i = 0; i < temp.length()/2; i++){
            if (temp.charAt(i) != temp.charAt(temp.length()-i-1)) {
                palin = false; 
                break;
            }
        }
        return palin;
    }
}
