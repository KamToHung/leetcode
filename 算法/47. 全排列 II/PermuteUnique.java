import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PermuteUnique {


    class Solution {

        List<List<Integer>> result = new ArrayList<>();

        boolean[] flag;

        public List<List<Integer>> permuteUnique(int[] nums) {
            if (nums == null) {
                return result;
            }
            Arrays.sort(nums);
            flag = new boolean[nums.length];
            dfs(nums, new LinkedList<>());
            return result;
        }

        public void dfs(int[] nums, LinkedList<Integer> numbers) {
            if (nums.length == numbers.size()) {
                result.add(new ArrayList<>(numbers));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (flag[i]) {
                    continue;
                }
                // 新添加的剪枝逻辑，固定相同的元素在排列中的相对位置
                if (i > 0 && nums[i] == nums[i - 1] && !flag[i - 1]) {
                    continue;
                }
                flag[i] = true;
                numbers.add(nums[i]);
                dfs(nums, numbers);
                numbers.removeLast();
                flag[i] = false;
            }
        }

    }

}
