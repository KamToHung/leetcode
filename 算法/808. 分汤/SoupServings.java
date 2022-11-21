
public class SoupServings {

    class Solution {

        public double soupServings(int n) {
            // 首先我们可以先把25单位作为计算，那么有以下几种分配比例
            // 1:0 2:2 3:1 1:3
            // x为A的分配量，y为B的分配量
            // 动态方程式:f(x)(y) = 0.25 * (f(x-4)(y) + f(x-3)(y-1) + f(x-2)(y-2) + f(x-1)(y-3))
            if (n > 4450) {
                return 1;
            }
            n = (int) Math.ceil((double) n / 25);
            double[][] dp = new double[n + 1][n + 1];
            // 如果A分完B也分完，那么为 0 + 1*0.5 = 0.5
            dp[0][0] = 0.5;
            // 如果A分完B还有，那么为 1 + 0*0.5 = 1
            for (int i = 1; i <= n; i++) {
                dp[0][i] = 1.0;
            }
            // 如果A还有B分完，那么为 0 + 0*0.5 = 0
            for (int i = 1; i < n; i++) {
                dp[i][0] = 0.0;
            }
            // 剩余情况为所有概率*0.25，每种概率最小为0
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    dp[i][j] = (dp[Math.max(0, i - 4)][j] + dp[Math.max(0, i - 3)][Math.max(0, j - 1)] + dp[Math.max(0, i - 2)][Math.max(0, j - 2)] + dp[Math.max(0, i - 1)][Math.max(0, j - 3)]) / 4.0;
                }
            }
            return dp[n][n];
        }

    }

}
