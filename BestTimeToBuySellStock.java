class Solution {
    public int maxProfit(int[] prices) {

        int cheap = Integer.MAX_VALUE;
        int maxprof = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < cheap) {
                cheap = prices[i];
            } else if (prices[i] - cheap > maxprof) {
                maxprof = prices[i] - cheap;
            }
        }
        return maxprof;

    }
}