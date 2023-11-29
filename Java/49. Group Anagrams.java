class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, Integer> hm = new HashMap<String,Integer>();
        int[] category = new int[strs.length];
        int type = 0;

        for (int i = 0; i< strs.length; i++){

            String orderedString = reOrderString(strs[i]);

            //contains anagram
            if (hm.containsKey(orderedString)){
                category[i] = hm.get(orderedString);
            } 
            //does not contain anagram
            else {
                category[i] = type;
                hm.put(orderedString, type++);
            }
        }

        for (int i = 0; i < type; i++){
            List<String> subAns = new ArrayList<>();
            for (int j = 0; j < strs.length; j++){
                if (category[j] == i) {
                    subAns.add(strs[j]);
                }
            }
            ans.add(subAns);
        }

        return ans;
    }

    public static String reOrderString(String val){
        char[] tempArr = val.toCharArray();
        Arrays.sort(tempArr);
        return String.valueOf(tempArr);
    }
}


