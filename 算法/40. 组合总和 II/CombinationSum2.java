import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum2 {

    class Solution {

        List<List<Integer>> result = new ArrayList<>();

        int sum = 0;

        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            if (candidates == null) {
                return result;
            }
            // 先排序，让相同的元素靠在一起
            Arrays.sort(candidates);
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
                // 剪枝逻辑，值相同的相邻树枝，只遍历第一条
                if (i > start && candidates[i] == candidates[i - 1]) {
                    continue;
                }
                sum += candidates[i];
                numbers.add(candidates[i]);
                helper(candidates, target, i + 1, numbers);
                numbers.removeLast();
                sum -= candidates[i];
            }
        }

    }

}
