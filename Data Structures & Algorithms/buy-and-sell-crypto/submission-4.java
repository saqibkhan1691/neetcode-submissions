class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        if (n == 1) {
            return 0;
        }

        int maxProfit = 0;

        // we dont take last because last day par buy karke future mein sell nahi kar sakte
        for (int index = 0; index < n - 1; index++) {

            // Ab tumhe index 1 ke baad maximum selling price find karna hai
            int max = prices[index];

            // index+1 means buy wale din ke baad se checking start hogi
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
