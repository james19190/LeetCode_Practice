class Solution {
    public int singleNumber(int[] nums) {

        Map<Integer, Integer> mp =new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
            } else {
                mp.put(nums[i],1);
            }
        }
        
        for (Integer k : mp.keySet() ){
            if(mp.get(k) == 1){
                return (k);
            } 
        }
        
        return 0;
    }
}
