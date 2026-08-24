class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=prices.length;
        int profit=0;
        for(int i=0;i<n;i++){
             min=Math.min(min,prices[i]);
             int maxpro=prices[i]-min;
             profit=Math.max(profit,maxpro);

        }
            return profit;
    }
}