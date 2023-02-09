import java.util.Arrays;

/**
 * @author <a href = "kamtohung@gmail.com">KamTo Hung</a>
 */
public class ThreeSumClosest {

    class Solution {

        public int threeSumClosest(int[] nums, int target) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            int result = 0;
            int distance = Integer.MAX_VALUE;
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                // 如果相等不需要再用来计算了
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int left = i + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum == target) {
                        return target;
                    } else if (sum < target) {
                        if (target - sum < distance) {
                            distance = target - sum;
                            result = sum;
                        }
                        left++;
                    } else {
                        if (sum - target < distance) {
                            distance = sum - target;
                            result = sum;
                        }
                        right--;
                    }
                }
            }
            return result;
        }

    }

}
