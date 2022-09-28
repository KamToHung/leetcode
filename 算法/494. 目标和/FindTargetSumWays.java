
public class FindTargetSumWays {

    class Solution {

        int result = 0;

        int total = 0;

        public int findTargetSumWays(int[] nums, int target) {
            if (nums.length == 0) {
                return 0;
            }
            dfs(nums, target, 0);
            return result;
        }

        public void dfs(int[] nums, int target, int index) {
            if(nums.length == index) {
                if(target == total) {
                    result++;
                }
                return;
            }
            // 加
            total += nums[index];
            dfs(nums, target, index + 1);
            total -= nums[index];
            // 减
            total -= nums[index];
            dfs(nums, target, index + 1);
            total += nums[index];
        }

    }
}
