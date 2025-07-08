package DSA.Leetcode_Problems;

public class Q121 {
     public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        int maxP = 0;

        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            profit = prices[i] - min;
            maxP = Math.max(maxP, profit);
        }
        return maxP;
    }
}
