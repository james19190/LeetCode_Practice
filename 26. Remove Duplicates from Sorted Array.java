class Solution {
    public int removeDuplicates(int[] nums) {
        

        //in the case there is 1 element
        if(nums.length < 2){return nums.length;}

        int counter = 1;

        for(int i = 0; i < nums.length-1; ++i){
            if(nums[i] == nums[i+1]){
                continue;
            }else{
                nums[counter] = nums[i+1];
                counter++;
            }
        }

        return counter;

    }

}
