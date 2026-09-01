class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        if (n == 1) {
            return 0;
        }

        int maxProfit = 0;

        for (int index = 0; index < n - 1; index++) {

            int max = prices[index];

            for (int i = index + 1; i < n; i++) {
                if (prices[i] > max) {
                    max = prices[i];
                }
            }

            maxProfit = Math.max(maxProfit, max - prices[index]);
        }

        return maxProfit;
    }
}