
public class IslandPerimeter {

    class Solution {

        public int islandPerimeter(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int result = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int value = grid[i][j];
                    // 如果为岛屿，判断四周是否有岛屿，没的话周长+1
                    if (value == 1) {
                        // 上边为0或者上边为边界
                        if (i == 0 || grid[i - 1][j] == 0) {
                            result++;
                        }
                        // 下边为0或者下边为边界
                        if (i == m - 1 || grid[i + 1][j] == 0) {
                            result++;
                        }
                        // 左边为0或者左边为边界
                        if (j == 0 || grid[i][j - 1] == 0) {
                            result++;
                        }
                        // 右边为0或者右边为边界
                        if (j == n - 1 || grid[i][j + 1] == 0) {
                            result++;
                        }
                    }
                }
            }
            return result;
        }

    }

}
