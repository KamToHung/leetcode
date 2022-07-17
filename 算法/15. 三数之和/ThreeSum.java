import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            if (nums == null || nums.length == 0) {
                return result;
            }
            Arrays.sort(nums);
            for(int i=0; i<nums.length; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int left = i + 1;
                int right = nums.length - 1;
                while(left < right) {
                    if (left > i + 1 && nums[left] == nums[left - 1]) {
                        left++;
                        continue;
                    }
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum == 0) {
                        List<Integer> sums = new ArrayList<>();
                        sums.add(nums[i]);
                        sums.add(nums[left]);
                        sums.add(nums[right]);
                        result.add(sums);
                        left++;
                        right--;
                    } else if (sum < 0){
                        left++;
                    } else {
                        right--;
                    }
                }
            }
            return result;
        }
    }

}
