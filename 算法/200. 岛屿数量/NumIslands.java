
public class NumIslands {

    class Solution {

        public int numIslands(char[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int sum = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == '1') {
                        replace(grid, i, j);
                        sum++;
                    }
                }
            }
            return sum;
        }

        public void replace(char[][] grid, int i, int j) {
            if (i < 0 || j < 0 || i > grid.length - 1 || j > grid[0].length - 1 || grid[i][j] == '0') {
                return;
            }
            grid[i][j] = '0';
            replace(grid, i + 1, j);
            replace(grid, i - 1, j);
            replace(grid, i, j - 1);
            replace(grid, i, j + 1);
        }

    }


}
