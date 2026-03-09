class Solution {
    public int maxProfit(int[] prices) {
        int dp0 = 0;
        int dp1 = -prices[0];

        for (int i = 1; i < prices.length; i++) {
            int prevDp0 = dp0;
            dp0 = Math.max(dp0, dp1 + prices[i]);
            dp1 = Math.max(dp1, prevDp0 - prices[i]);
        }
        return dp0;
    }
}