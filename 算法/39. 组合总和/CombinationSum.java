import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum {

    class Solution {

        List<List<Integer>> result = new ArrayList<>();

        int sum = 0;

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            if (candidates == null) {
                return result;
            }
            helper(candidates, target, 0, new LinkedList<>());
            return result;
        }

        public void helper(int[] candidates, int target, int start, LinkedList<Integer> numbers) {
            if (sum >= target) {
                if (sum == target) {
                    result.add(new ArrayList<>(numbers));
                }
                return;
            }
            for (int i = start; i < candidates.length; i++) {
                sum += candidates[i];
                numbers.add(candidates[i]);
                // 同一层可以重复使用，所以start=i
                helper(candidates, target, i, numbers);
                numbers.removeLast();
                sum -= candidates[i];
            }
        }

    }

}
