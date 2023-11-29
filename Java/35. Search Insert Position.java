class Solution {
    public int searchInsert(int[] nums, int target) {

        if(nums.length == 0)return 0;
        
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        
        while(left <= right){
            
            if(target<nums[left]) {
                return left;
            }
            if(target>nums[right]){
                return right+1;
            }
            
            mid = (left+right)/2;
            
            if(nums[mid]==target){
                return mid;
            }

            else if(target < nums[mid]){
                right = mid-1;
            }
            
            else{
                left = mid +1;
            }
            
        }
        return -1;
    }
}
