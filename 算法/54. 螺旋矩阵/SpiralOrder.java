import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {

    class Solution {

        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> result = new ArrayList<>();
            if (matrix == null) {
                return result;
            }
            int left = 0;
            int right = matrix[0].length - 1;
            int up = 0;
            int down = matrix.length - 1;
            // 每次一圈
            while (left <= right && up <= down) {
                // 避免重复
                for (int i = left; i <= right && up <= down; i++) {
                    result.add(matrix[up][i]);
                }
                up++;
                for (int i = up; i <= down && left <= right; i++) {
                    result.add(matrix[i][right]);
                }
                right--;
                for (int i = right; i >= left && up <= down; i--) {
                    result.add(matrix[down][i]);
                }
                down--;
                for (int i = down; i >= up && left <= right; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
            return result;
        }

    }

}
