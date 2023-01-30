
public class CheckXMatrix {

    class Solution {

        public boolean checkXMatrix(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            // 如果不等则证明不是正方形矩阵
            if (m != n) {
                return false;
            }
            // 遍历
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    // 如果i等于j或者在四个角上面
                    if (i == j || i + j == n - 1) {
                        if (grid[i][j] == 0) {
                            return false;
                        }
                    } else {
                        if (grid[i][j] != 0) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }

    }

}
