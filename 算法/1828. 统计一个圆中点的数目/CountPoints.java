
public class CountPoints {

    class Solution {
        public int[] countPoints(int[][] points, int[][] queries) {
            int n = queries.length;
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                int count = 0;
                double queryX = queries[i][0];
                double queryY = queries[i][1];
                double queryR = queries[i][2];
                for (int[] point : points) {
                    double pointX = point[0];
                    double pointY = point[1];
                    // 数学公式
                    double length = (pointX - queryX) * (pointX - queryX) + (pointY - queryY) * (pointY - queryY);
                    if (length <= queryR * queryR) {
                        count++;
                    }
                }
                result[i] = count;
            }
            return result;
        }
    }

}
