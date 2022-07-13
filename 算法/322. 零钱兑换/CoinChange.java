
public class CoinChange {

    class Solution {
        public int coinChange(int[] coins, int amount) {
            //动态转移方程式：f(x) = min(f(x), f(x - coin) + 1)
            // f(0) = 0
            int[] dp = new int[amount + 1];
            for (int i = 1; i < amount + 1; i++) {
                int min = amount + 1;
                for (int j = 0; j < coins.length; j++) {
                    if (i >= coins[j]) {
                        int value = dp[i - coins[j]] + 1;
                        min = Math.min(min, value);
                    }
                }
                dp[i] = min;
            }
            return dp[amount] == amount + 1 ? -1 : dp[amount];
        }
    }

}
