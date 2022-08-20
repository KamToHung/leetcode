public class Rotate {

    class Solution {

        public void rotate(int[][] matrix) {
            int n = matrix.length;
            // 对角线镜像映射
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            // 翻转二维矩阵每一行
            for (int[] row : matrix) {
                reserve(row);
            }
        }

        // 翻转数组
        private void reserve(int[] row) {
            int left = 0;
            int right = row.length - 1;
            while (left < right) {
                int temp = row[left];
                row[left] = row[right];
                row[right] = temp;
                left++;
                right--;
            }
        }

    }

}
