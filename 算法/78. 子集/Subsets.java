import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Subsets {

    class Solution {

        List<List<Integer>> result = new ArrayList<>();

        public List<List<Integer>> subsets(int[] nums) {
            if (nums == null) {
                return result;
            }
            helper(nums, new LinkedList<>(), 0);
            return result;
        }

        public void helper(int[] nums, LinkedList<Integer> numbers, int start) {
            result.add(new ArrayList<>(numbers));
            for (int i = start; i < nums.length; i++) {
                numbers.add(nums[i]);
                helper(nums, numbers, i + 1);
                numbers.removeLast();
            }
        }

    }

}
