public class MinOperations {

    class Solution {
        public int minOperations(int[] nums, int x) {
            // 长度
            int maxLen = -1;
            // 数组总和
            int sum = 0;
            for (int num : nums) {
                sum += num;
            }
            // 剩余连续子数组的总和
            int target = sum - x;
            // 滑动窗口
            int left = 0;
            int right = 0;
            // 当前窗口的和
            int nowSum = 0;
            // 数组长度
            int len = nums.length;
            while (right < len) {
                // right往右滑动
                nowSum += nums[right];
                right++;
                while (nowSum > target && left < right) {
                    // left往右滑动
                    nowSum -= nums[left];
                    left++;
                }
                // 完成条件
                if (nowSum == target) {
                    maxLen = Math.max(maxLen, right - left + 1);
                }
            }
            return maxLen == -1 ? -1 : len - maxLen;
        }
    }

}
