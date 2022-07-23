public class SearchRange {

    class Solution {


        public int[] searchRange(int[] nums, int target) {
            // 二分法查找
            int left = search(nums, target, true);
            int right = search(nums, target, false);
            return new int[]{left, right};
        }

        public int search(int[] nums, int target, boolean isLeft) {
            int left = 0;
            int right = nums.length - 1;
            // 保存结果
            int result = -1;
            // 左闭右闭
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    result = mid;
                    // 如果是找左边，则相等的时候直接往左边找即可
                    if (isLeft) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                } else if (nums[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return result;
        }

    }

}
