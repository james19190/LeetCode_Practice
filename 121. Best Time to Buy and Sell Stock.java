class Solution {
    public int maxProfit(int[] prices) {

        int min = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++){
            if (prices[i] < min) min = prices[i];
            else if (prices[i] - min > maxProfit) maxProfit = prices[i] - min; 
        }
        return maxProfit;
    }
}

/*
        if (prices.length == 0) return 0;

        int minVal = Integer.MAX_VALUE;
        int minValP = 0 ;
        for (int i = 0; i < prices.length; i++){
            if (minVal > prices[i]) {
                minVal = prices[i];
                minValP = i;
            }
        }

        int maxP = 0;
        for(int i = minValP; i < prices.length; i++){
            if (prices[i]- prices[minValP] > maxP) maxP = prices[i] - prices[minValP];
        }

        return maxP; */
