class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = 0;

        for (int p : piles) {
            max = Math.max(max, p);
        }

        int low = 1;
        int high = max;
        int ans = max;

        while (low <= high) {

            int banana = low + (high - low) / 2;

            long totalTime = 0;

            for (int i = 0; i < piles.length; i++) {
                totalTime += Math.ceil((double) piles[i] / banana);
            }

            if (totalTime <= h) {
                ans = banana;
                high = banana - 1;
            } 
            else {
                low = banana + 1;
            }
        }

        return ans;
    }
}