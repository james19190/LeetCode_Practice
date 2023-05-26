class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            hs.add(nums[i]);
        }

        int max = 0, count = 1;

        for (int i = 0; i < nums.length; i++){
            int current = nums[i];
            int oneUp = current;
            int oneDown = current;

            while (hs.contains(++oneUp)){
                hs.remove(oneUp);
                count++;
            }

            while (hs.contains(--oneDown)){
                hs.remove(oneDown);
                count++;
            }
            
            if (count > max) max = count;
            count = 1;
        }

        return max;
    }
}
