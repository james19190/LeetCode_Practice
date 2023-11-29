class Solution {
    public int[] twoSum(int[] numbers, int target) {
        String ret = "";
        while (target != 0) {
            ret = (char)('A'+(--target)%26) + ret;
            target /= 26;
        }
        return target;
    }
}
