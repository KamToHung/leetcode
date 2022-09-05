public class CoinChange2 {

    static class Solution {

        public int change(int amount, int[] coins) {
            int[] dp = new int[amount + 1];
            dp[0] = 1;
            for(int coin : coins) {
                for(int i = 1; i <= amount; i++) {
                    if (i >= coin) {
                        dp[i] = dp[i] + dp[i - coin];
                    }
                }
            }
            return dp[amount];
        }

        private int sum = 0;

        private int count = 0;

        public int change1(int amount, int[] coins) {
            if (coins == null || coins.length == 0) {
                return 0;
            }
            helper(amount, coins, 0);
            return count;
        }

        public void helper(int amount, int[] coins, int start) {
            if (sum >= amount) {
                if (sum == amount) {
                    count++;
                }
                return;
            }
            for(int i = start; i < coins.length; i++) {
                int coin = coins[i];
                if (coin > amount) {
                    continue;
                }
                sum += coin;
                helper(amount, coins, i);
                sum -= coin;
            }
        }


        public static void main(String[] args) {
            Solution solution = new Solution();
            int[] a = {3,5,7,8,9,10,11};
            int sum = solution.change(500, a);
            System.out.println(sum);
        }
    }

}
