import java.util.HashSet;
import java.util.Set;

/**
 * 利用Set排重特性,如果存在相等的子数组那么总数必然小于统计数量s
 *
 * @author <a href = "kamtohung@gmail.com">KamTo Hung</a>
 */
public class FindSubarrays {

    class Solution {

        public boolean findSubarrays(int[] nums) {
            int n = nums.length - 1;
            Set<Integer> memo = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int value = nums[i] + nums[i + 1];
                memo.add(value);
            }
            return memo.size() != n;
        }

    }

}
