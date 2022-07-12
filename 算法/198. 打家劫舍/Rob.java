
public class Rob {

    class Solution {
        public int rob(int[] nums) {
            //状态转移方程式 f(x) = max(v(x)+f(x-2), f(x-1))
            //出口: f(0) = v(0), f(1) = max(v(0), v(1))
            if (nums.length < 2) {
                return nums[0];
            }
            int[] dp = new int[nums.length];
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0], nums[1]);
            for (int i = 2; i < nums.length; i++) {
                dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
            }
            return dp[nums.length - 1];
        }
    }

}
