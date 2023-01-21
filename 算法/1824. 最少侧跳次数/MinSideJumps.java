public class MinSideJumps {

    class Solution {

        public int minSideJumps(int[] obstacles) {
            // 动态规划题
            // 找出动态规划的状态转移方程
            // f(x,y) = f(x-1,y) 当前没石头可以直接跳
            // f(x,y) = min(f(x-1,y), f(x-1,(y+1)%3) + 1, f(x-1,(y+2)%3) + 1) 当前一步没有障碍物，可以跳到其他两个位置
            // f(x,y) = max , 当前有石头，需要跳到其他道路
            int n = obstacles.length;
            // 长度为n，宽度为3的二维数组，dp[x][y]为到达(x,y)最小侧跳次数
            int[][] dp = new int[n][3];
            // 因为从(0,1)开始，所以到(0,0)首先要侧跳一次
            dp[0][0] = 1;
            // 因为从(0,1)开始，所以到默认侧跳次数为0
            dp[0][1] = 0;
            // 因为从(0,1)开始，所以到(0,2)首先要侧跳一次
            dp[0][2] = 1;
            // 遍历
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    if (obstacles[i] != j + 1) {
                        // 如果当前位置没有石头，则侧跳次数和上个位置一样
                        dp[i][j] = dp[i - 1][j];
                        // 如果当前跑道前一步没有障碍，则可以从其他位置侧跳过来
                        if (obstacles[i - 1] != j + 1) {
                            dp[i][j] = Math.min(dp[i][j], Math.min(dp[i - 1][(j + 1) % 3] + 1, dp[i - 1][(j + 2) % 3] + 1));
                        }
                    } else {
                        // 如果当前位置有石头，则i+1位置是跳不过去的，这时候设置最大值
                        dp[i][j] = 0x3f3f3f3f;
                    }
                }
            }
            // 结果是三个位置上最小的一个
            return Math.min(dp[n - 1][0], Math.min(dp[n - 1][1], dp[n - 1][2]));
        }

    }

}
