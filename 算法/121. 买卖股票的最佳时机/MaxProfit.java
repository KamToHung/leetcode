
public class MaxProfit {

    class Solution {
        public int maxProfit(int[] prices) {
            // 记录今天之前买入最小值和记录卖出的最大利润，比较每天的最大利润
            int min = prices[0];
            int max = 0;
            for (int i = 1; i < prices.length; i++) {
                max = Math.max(max, prices[i] - min);
                min = Math.min(min, prices[i]);
            }
            return max;
        }
    }

}
