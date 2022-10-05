/**
 * @author kamtohung
 * @since 2022/10/5
 */
public class Exist {

    class Solution {

        public boolean exist(char[][] board, String word) {
            // 思路：建立memo记录走过的地方，dfs
            int m = board.length;
            int n = board[0].length;
            boolean[][] memo = new boolean[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    // 0没有处理啊
                    if (board[i][j] == word.charAt(0)) {
                        if (dfs(board, word, i, j, memo, 0)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public boolean dfs(char[][] board, String word, int m, int n, boolean[][] memo, int index) {
            if (word.length() == index) {
                return true;
            }
            if (m < 0 || m > board.length - 1 || n < 0 || n > board[0].length - 1 || memo[m][n]) {
                return false;
            }
            if (word.charAt(index) != board[m][n]) {
                return false;
            }
            memo[m][n] = true;
            boolean flag = dfs(board, word, m - 1, n, memo, index + 1) ||
                    dfs(board, word, m + 1, n, memo, index + 1) ||
                    dfs(board, word, m, n + 1, memo, index + 1) ||
                    dfs(board, word, m, n - 1, memo, index + 1);
            memo[m][n] = false;
            return flag;
        }

    }

}
