
public class MaxValue {

    class Solution {
        public int maxValue(int n, int index, int maxSum) {
            // 从index位置向左右两边展开
            int left = index;
            int right = index;
            // 首先每个位置都最小为1
            // 所以初始化和为sum=1+1+1+...+1 (n个1)=1*n
            int sum = n;
            // 当前index位置的最大数,题目就是要获得此答案
            int max = 1;
            // 直到总和还不到maxSum的时候
            while (sum <= maxSum) {
                max++;
                // 如果在左右边界则终止，此时结果为sum+剩余大小/n
                if (left == 0 && right == n - 1) {
                    return max - 1 + (maxSum - sum) / n;
                }
                sum += right - left + 1;
                // 到了边缘位置
                right = Math.min(n - 1, ++right);
                left = Math.max(0, --left);
            }
            return max - 1;
        }
    }

}
