/**
 * @author <a href = "mailto:kamtohung@gmail.com">KamTo Hung</a>
 */
public class CanPartition {

    static class Solution {
        public boolean canPartition(int[] nums) {
            if (nums == null || nums.length == 0) {
                return false;
            }
            int n = nums.length;
            int sum = 0;
            for (int num : nums) {
                sum += num;
            }
            // 如果不能平分则返回false;
            if (sum % 2 != 0) {
                return false;
            }
            int target = sum / 2;
            int[] dp = new int[target + 1];
            dp[0] = 1;
            for (int num : nums) {
                for (int i = target; i >= num; i--) {
                    dp[i] = dp[i] + dp[i - num];
                }
            }
            return dp[target] != 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.canPartition(new int[]{1, 5, 11, 5});
        System.out.println(result);
    }

}
