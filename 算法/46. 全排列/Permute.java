import java.util.*;

public class Permute {

    class Solution {

        List<List<Integer>> result = new ArrayList<>();

        public List<List<Integer>> permute(int[] nums) {
            if (nums == null) {
                return result;
            }
            helper(nums, new HashMap<>(), new LinkedList<>());
            return result;
        }

        public void helper(int[] nums, Map<Integer, Integer> memo, LinkedList<Integer> numbers) {
            if (nums.length == numbers.size()) {
                // 第一种: 判断list是否含有重复数据
                result.add(new ArrayList<>(numbers));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (memo.get(nums[i]) != null) {
                    continue;
                }
                memo.put(nums[i], 0);
                numbers.add(nums[i]);
                helper(nums, memo, numbers);
                numbers.removeLast();
                memo.remove(nums[i]);
            }
        }

    }

}
