class Solution {
    public int majorityElement(int[] nums) {
            
        HashMap<Integer,Integer> s = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if (s.containsKey(nums[i])){
                s.put(nums[i],s.get(nums[i])+1);
            } else {
                s.put(nums[i],1);
            }
        }

        int maxCount = 0;
        int maxVal = 0;

        for (Integer k : s.keySet()){
            if (s.get(k) > maxCount){
                maxVal = k;
                maxCount = s.get(k);
            }        
        }

        return maxVal;


    }
}
