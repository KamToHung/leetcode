import java.util.*;

public class SubsetsWithDup {

    class Solution {

        List<List<Integer>> result = new ArrayList<>();

        public List<List<Integer>> subsetsWithDup(int[] nums) {
            if (nums == null) {
                return result;
            }
            Arrays.sort(nums);
            helper(nums, 0, new LinkedList<>());
            return result;
        }

        public void helper(int[] nums, int start, LinkedList<Integer> numbers) {
            result.add(new ArrayList<>(numbers));
            for (int i = start; i < nums.length; i++) {
                if (i > start && nums[i] == nums[i - 1]) {
                    continue;
                }
                numbers.add(nums[i]);
                helper(nums, i + 1, numbers);
                numbers.removeLast();
            }
        }

    }

}
