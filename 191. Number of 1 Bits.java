public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int oneCount = 0;

        // difference between toString and toBinaryString???
        String val = Integer.toBinaryString(n);

        for (int i = 0; i < val.length(); i++){
            if (val.charAt(i) == '1') oneCount++;
        }

        return oneCount;
    }
}
