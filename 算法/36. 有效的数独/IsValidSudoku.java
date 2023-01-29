import java.util.HashSet;

public class IsValidSudoku {

    class Solution {

        public boolean isValidSudoku(char[][] board) {
            HashSet<String> seen = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    char c = board[i][j];
                    if (c != '.') { // c为数字
                        if (!seen.add(c + " found in row " + i) ||  // 判断数字在行、列、block中是否重复出现
                                !seen.add(c + " found in column " + j) ||
                                !seen.add(c + " found in block " + i / 3 + "-" + j / 3)) return false;
                    }
                }
            }
            return true;
        }

        public boolean isValidSudoku1(char[][] board) {
            int[][] rows = new int[9][9];
            int[][] columns = new int[9][9];
            int[][][] subboxes = new int[3][3][9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    char c = board[i][j];
                    if (c != '.') {
                        int index = c - '0' - 1;
                        rows[i][index]++;
                        columns[j][index]++;
                        subboxes[i / 3][j / 3][index]++;
                        if (rows[i][index] > 1 || columns[j][index] > 1 || subboxes[i / 3][j / 3][index] > 1) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }

    }


}
