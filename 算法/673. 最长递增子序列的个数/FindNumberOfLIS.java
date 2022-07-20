public class FindNumberOfLIS {

    static class Solution {

        public int findNumberOfLIS(int[] nums) {
            int[] dp = new int[nums.length];
            int[] result = new int[nums.length];
            int maxLength = 0;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                dp[i] = 1;
                result[i] = 1;
                for (int j = 0; j < i; j++) {
                    if (nums[j] >= nums[i]) {
                        continue;
                    }
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        result[i] = result[j];
                    } else if (dp[j] + 1 == dp[i]) {
                        result[i] = result[i] + result[j];
                    }
                }
                if (dp[i] > maxLength) {
                    maxLength = dp[i];
                    count = result[i];
                } else if (dp[i] == maxLength) {
                    count = count + result[i];
                }
            }
            return count;
        }

    }

}

