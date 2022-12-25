
public class MinimumBoxes {

    class Solution {
        // 参考,找规律
        // https://leetcode.cn/problems/building-boxes/solutions/2031813/mei-xiang-ming-bai-yi-ge-dong-hua-miao-d-8vbe/
        public int minimumBoxes(int n) {
            int ans = 0, maxN = 0;
            for (int i = 1; maxN + ans + i <= n; ++i) {
                ans += i;
                maxN += ans;
            }
            for (int j = 1; maxN < n; ++j) {
                ++ans;
                maxN += j;
            }
            return ans;
        }
    }

}
