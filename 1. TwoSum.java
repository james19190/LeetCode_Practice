class Solution {
    public int[] twoSum(int[] nums, int target) {

        int sum;
        for (int i = 0; i < nums.length; i++){
            for (int k = i+1; k < nums.length; k++){
                sum = nums[i] + nums[k];  
                if (sum == target){
                    int[] ans = {i,k};
                    return ans;
                }
            }
        }
        return null;
    }
}
