public class LengthOfLIS {

    class Solution {
        public int lengthOfLIS(int[] nums) {
            int result = 0;
            int[] dp = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                int max = 1;
                for (int j = 0; j < i; j++) {
                    if (nums[i] <= nums[j]) {
                        continue;
                    }
                    int value = dp[j] + 1;
                    max = Math.max(max, value);
                }
                dp[i] = max;
                result = Math.max(result, dp[i]);
            }
            return result;
        }
    }

}
