
public class CuttingRope {

    class Solution {
        public int cuttingRope(int n) {
            int[] dp = new int[n + 1];
            dp[0] = 0;
            dp[1] = 0;
            dp[2] = 1;
            for (int i = 3; i < n + 1; i++) {
                int max = 0;
                // 最小为1
                for (int j = 1; j < i; j++) {
                    int nowMaxValue = Math.max(dp[i - j] * j, (i - j) * j);
                    max = Math.max(max, nowMaxValue);
                }
                dp[i] = max;
            }
            return dp[n];
        }
    }

}
