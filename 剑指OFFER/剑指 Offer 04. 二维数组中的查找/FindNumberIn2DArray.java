/**
 * @author kamtohung
 * @since 2022/10/5
 */
public class FindNumberIn2DArray {

    class Solution {

        public boolean findNumberIn2DArray(int[][] matrix, int target) {
            if(matrix == null || matrix.length == 0) {
                return false;
            }
            int m = matrix.length;
            int n = matrix[0].length;
            int x = 0;
            int y = n - 1;
            while(x < m && y >= 0) {
                if (matrix[x][y] > target) {
                    y--;
                } else if (matrix[x][y] < target) {
                    x++;
                } else {
                    return true;
                }
            }
            return false;
        }

    }

}
