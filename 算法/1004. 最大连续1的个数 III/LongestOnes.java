
public class LongestOnes {

    class Solution {

        public int longestOnes(int[] nums, int k) {
            // 滑动窗口
            int left = 0;
            int right = 0;
            int result = 0;
            // 计数
            int count = k;
            while (right < nums.length) {
                int curValue = nums[right];
                if (curValue == 0) {
                    count--;
                }
                while (count < 0) {
                    int leftValue = nums[left];
                    if (leftValue == 0) {
                        count++;
                    }
                    left++;
                }
                result = Math.max(result, right - left + 1);
                right++;
            }
            return result;
        }

    }

}
