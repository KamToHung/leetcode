
public class Rob2 {

    class Solution {
        public int rob(int[] nums) {
            //状态转移方程式 f(x) = max(v(x)+f(x-2), f(x-1))
            //出口: f(0) = v(0), f(1) = max(v(0), v(1))
            if (nums.length == 1) {
                return nums[0];
            }
            if (nums.length == 2) {
                return Math.max(nums[0], nums[1]);
            }
            // 拆分两个数组处理，分别为0~n-1, 1~n
            int[] firstArray = getArray(nums, 0, nums.length - 2);
            int[] firstDp = getDp(firstArray);
            int[] secondArray = getArray(nums, 1, nums.length - 1);
            int[] secondDp = getDp(secondArray);
            return Math.max(firstDp[firstArray.length - 1], secondDp[secondArray.length - 1]);
        }

        private int[] getDp(int[] array) {
            int[] dp = new int[array.length];
            dp[0] = array[0];
            dp[1] = Math.max(array[0], array[1]);
            for (int i = 2; i < array.length; i++) {
                dp[i] = Math.max(array[i] + dp[i - 2], dp[i - 1]);
            }
            return dp;
        }

        public int[] getArray(int[] nums, int start, int end) {
            int[] result = new int[end - start + 1];
            for (int i = 0; i < end - start + 1; i++) {
                result[i] = nums[i + start];
            }
            return result;
        }

    }

}
