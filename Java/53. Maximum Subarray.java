class Solution {
    public int maxSubArray(int[] nums) {

        if (nums.length == 0) return 0;

        int max = nums[0];
        int sum = 0;
        
        for (int i = 0; i < nums.length; i++){
            if (sum < 0) sum = 0;
            sum += nums[i];
            max = Math.max(sum, max);
        }

        return max;
    }
}

/*
Question
    1) does it include negative numbers? - yes
    2) empty array is passed? = no

method 1 - check every possible subarray and find max

method 2 - keep a running counter of the sum while cycling through
    int max
    int counter

    if max < 0, counter = 0 (can ignore all of left side)
    compare max and counter at every turn 

*/
