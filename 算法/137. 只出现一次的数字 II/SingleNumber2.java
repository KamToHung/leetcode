import java.util.HashMap;
import java.util.Map;

public class SingleNumber2 {


    class Solution {
        public int singleNumber(int[] nums) {
            if (nums == null || nums.length == 0) {
                return -1;
            }
            Map<Integer, Integer> memo = new HashMap<>();
            for (int num : nums) {
                memo.put(num, memo.getOrDefault(num, 0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : memo.entrySet()) {
                if (entry.getValue() == 1) {
                    return entry.getKey();
                }
            }
            return -1;
        }
    }

}
