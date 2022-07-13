
public class CoinChange {

    class Solution {
        public int coinChange(int[] coins, int amount) {
            //动态转移方程式：f(x) = min(f(x), f(x - coin) + 1)
            // f(0) = 0
            // amount + 1 相当于正无穷大
            int[] dp = new int[amount + 1];
            for (int i = 1; i < amount + 1; i++) {
                for (int coin : coins) {
                    if (i < coin) {
                        continue;
                    }
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
            return dp[amount] == amount + 1 ? -1 : dp[amount];
        }
    }

}
