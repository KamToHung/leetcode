
public class BestCoordinate {

    /**
     * <a href="https://leetcode.cn/problems/coordinate-with-maximum-network-quality/solutions/1942904/by-ac_oier-xtx3/">...</a>
     */
    class Solution {
        public int[] bestCoordinate(int[][] towers, int k) {
            int[][] g = new int[110][110];
            int x = 0, y = 0, val = 0;
            for (int[] t : towers) {
                int a = t[0], b = t[1], q = t[2];
                for (int i = Math.max(0, a - k); i <= a + k; i++) {
                    for (int j = Math.max(0, b - k); j <= b + k; j++) {
                        double d = Math.sqrt((a - i) * (a - i) + (b - j) * (b - j));
                        if (d > k) continue;
                        g[i][j] += Math.floor(q / (1 + d));
                        if (g[i][j] > val) {
                            x = i; y = j; val = g[i][j];
                        } else if (g[i][j] == val && (i < x || (i == x && j < y))) {
                            x = i; y = j;
                        }
                    }
                }
            }
            return new int[]{x, y};
        }
    }


}
