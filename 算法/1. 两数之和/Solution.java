import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> memo = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (memo.containsKey(result)) {
                return new int[]{memo.get(result), i};
            }
            memo.put(nums[i], i);
        }
        return new int[0];
    }

}
