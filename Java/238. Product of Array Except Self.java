class Solution {
    public int[] productExceptSelf(int[] nums) {
        int multiple = 1;   
        int[] leftMulti = new int[nums.length];
        int[] rightMulti = new int[nums.length];
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            leftMulti[i] = multiple;
            multiple *= nums[i];
        }

        multiple = 1;

        for (int i = nums.length -1; i >= 0; i--){
            rightMulti[i] = multiple;
            multiple *= nums[i]; 
        }

        for (int i = 0; i < nums.length; i++){
            ans[i] = leftMulti[i] * rightMulti[i];
        }

        return ans;
    }
}

/*
[1,2,3,4]
[24,12,8,6]

method 1 - brute force
for every single i -> nums.length multiply the other values and insert into ans <O(n)>

method 2 - multiple = left multiple * right multiple
[1,2,3,4]
lm = [1,1,2]
multiple = 6
*/

