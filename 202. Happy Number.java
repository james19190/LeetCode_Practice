class Solution {
    public boolean isHappy(int n) {
        int curr;

        Map<Integer,Integer> values = new HashMap<>(); 
        String prev = Integer.toString(n);

        while (true){
            prev = Integer.toString(n);
            curr = 0;
            
            for (int i = 0 ; i < prev.length(); i++){
                curr += Math.pow(prev.charAt(i)-48,2);
            }

            if (values.get(curr) != null) return false;
            values.put(curr,1);
            if (curr == 1) return true;
            n = curr;
        }
    }
}


