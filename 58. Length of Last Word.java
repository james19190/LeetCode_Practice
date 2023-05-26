class Solution {
    public int lengthOfLastWord(String s) {
        String[] arrs = s.split(" ");
        for (int i = arrs.length - 1 ; i >= 0; i--){
            if (arrs[i].compareTo(" ") != 0){
                return arrs[i].length();
            }
        }
        return 0;
    }
}
