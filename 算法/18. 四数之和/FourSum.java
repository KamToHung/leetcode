import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    class Solution {

        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> result = new ArrayList<>();
            if (nums == null || nums.length < 4) {
                return result;
            }
            // 首先排序
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 3; i++) {
                // 相同的数字跳过
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                for (int j = i + 1; j < nums.length - 2; j++) {
                    // 相同的数字跳过
                    if (j > i + 1 && nums[j] == nums[j - 1]) {
                        continue;
                    }
                    // 左指针
                    int left = j + 1;
                    // 右指针
                    int right = nums.length - 1;
                    // 当左右指针未相碰时候
                    while (left < right) {
                        // 相等则跳过
                        if (left > j + 1 && nums[left] == nums[left - 1]) {
                            left++;
                            continue;
                        }
                        long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                        if (sum == target) {
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[left]);
                            list.add(nums[right]);
                            result.add(list);
                            left++;
                            right--;
                        } else if (sum < target) {
                            left++;
                        } else {
                            right--;
                        }
                    }
                }
            }
            return result;
        }

    }
}
