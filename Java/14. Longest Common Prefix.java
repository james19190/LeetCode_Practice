class Solution {
    public String longestCommonPrefix(String[] strs) {

        //no input        
        if(strs.length==0) return "";

        
        String pf=strs[0];

        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(pf)!=0){
                pf=pf.substring(0,pf.length()-1);
            }
            
        }
        return pf;
    }
}
