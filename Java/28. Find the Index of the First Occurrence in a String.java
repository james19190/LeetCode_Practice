class Solution {
    public int strStr(String haystack, String needle) {

        if (haystack.compareTo(needle) == 0) return 0;
        
        for (int i = 0; i <= haystack.length() - needle.length(); i++){
            if (haystack.charAt(i) == needle.charAt(0)){
                boolean match = true; 
                for (int j = 1; j < needle.length(); j++){
                    if (haystack.charAt(i+j) != needle.charAt(j)){
                        match = false;
                    }
                } 
                if (match) return i;
            }
        }

        return -1;
    }
}
