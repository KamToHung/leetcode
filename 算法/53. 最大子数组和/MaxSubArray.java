
public class MaxSubArray {

    class Solution {
        public int maxSubArray(int[] nums) {
            //状态转移方程式：f(x) = max(v(x), v(x) + f(x - 1))
            int[] dp = new int[nums.length];
            dp[0] = nums[0];
            int max = dp[0];
            for (int i = 1; i < nums.length; i++) {
                dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
                max = Math.max(max, dp[i]);
            }
            return max;
        }

        public int maxSubArrayTwo(int[] nums) {
            // 简化版，不需要用数组维护
            int max = nums[0];
            int pre = 0;
            for (int num : nums) {
                pre = Math.max(pre + num, num);
                max = Math.max(max, pre);
            }
            return max;
        }
    }

}
