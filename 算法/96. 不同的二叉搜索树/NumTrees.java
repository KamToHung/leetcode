public class NumTrees {

    class Solution {
        public int numTrees(int n) {
            // f(3) = f(2)*f(0) + f(1)*f(1) + f(0)*f(2)   左右子树不同的总和
            // 而总数也是左右子树不同的树的总和
            int[] dp = new int[n + 1];
            dp[0] = 0;
            dp[1] = 1;
            for (int i = 2; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    // 左右子树的不同的树的总和
                    dp[i] = dp[j - 1] + dp[i - j];
                }
            }
            return dp[n];
        }
    }

}
