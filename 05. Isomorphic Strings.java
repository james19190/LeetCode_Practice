class Solution {
    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> dict = new HashMap<>();
        Map<Character, Character> dict2 = new HashMap<>();
        
        int len = s.length();
        int count = 0;

        while(count < len){
            if (dict.get(s.charAt(count)) == null){
                dict.put(s.charAt(count), t.charAt(count));
            } else {
                if (dict.get(s.charAt(count)) != t.charAt(count)) {
                    return false;
                }
            }
            count++;
        }

        count = 0;
        while(count < len){
            if (dict2.get(t.charAt(count)) == null){
                dict2.put(t.charAt(count), s.charAt(count));
            } else {
                if (dict2.get(t.charAt(count)) != s.charAt(count)) {
                    return false;
                }
            }
            count++;
        }

        return true;
    }
}
