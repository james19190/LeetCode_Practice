public class Solution {
   public int titleToNumber(String s) {
      int len = s.length();
      int i = 0;
      int num = 0;
      while(i < len) {
         char ch = s.charAt(i);
         num += Math.pow(26, len-1-i) * ((ch - 'A') + 1);
         i++;
      }
      return num;
   }
}
