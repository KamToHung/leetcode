import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FindDisappearedNumbers {

    class Solution {

        public List<Integer> findDisappearedNumbers(int[] nums) {
            List<Integer> result = new ArrayList<>();
            if (nums == null || nums.length == 0) {
                return result;
            }
            Map<Integer, Integer> memo = new HashMap<>(nums.length);
            for (int num : nums) {
                memo.put(num, 0);
            }
            for (int i = 1; i <= nums.length; i++) {
                if (!memo.containsKey(i)) {
                    result.add(i);
                }
            }
            return result;
        }

    }

}
