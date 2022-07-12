
public class UniquePathsWithObstacles {

    class Solution {
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            //dp方程式：dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
            if (obstacleGrid.length == 0 || obstacleGrid[0][0] == 1) {
                return 0;
            }
            int m = obstacleGrid.length;
            int n = obstacleGrid[0].length;
            int[][] dp = new int[m][n];
            dp[0][0] = 1;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (obstacleGrid[i][j] == 1) {
                        dp[i][j] = 0;
                        continue;
                    }
                    if (i == 0 && j > 0) {
                        dp[i][j] = dp[i][j - 1];
                    } else if (i > 0 && j == 0) {
                        dp[i][j] = dp[i - 1][j];
                    } else if (i > 0 && j > 0) {
                        dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                    }
                }
            }
            return dp[m - 1][n - 1];
        }
    }

}
