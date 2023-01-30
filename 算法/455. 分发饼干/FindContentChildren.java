import java.util.Arrays;

public class FindContentChildren {

    class Solution {

        public int findContentChildren(int[] g, int[] s) {
            // 先排序，小胃口的孩子先吃小饼干
            Arrays.sort(g);
            Arrays.sort(s);
            int result = 0;
            int i = 0;
            int j = 0;
            while (i < g.length & j < s.length) {
                // 如果饼干能满足孩子，则结果集+1，index都+1
                if (g[i] <= s[j]) {
                    result++;
                    i++;
                    j++;
                } else {
                    // 如果饼干不能满足孩子，则饼干index+1
                    j++;
                }
            }
            return result;
        }

    }

}
