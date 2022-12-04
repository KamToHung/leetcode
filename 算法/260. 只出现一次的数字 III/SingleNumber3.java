import java.util.HashMap;
import java.util.Map;

public class SingleNumber3 {


    class Solution {
        public int[] singleNumber(int[] nums) {
            if (nums == null || nums.length == 0) {
                return null;
            }
            Map<Integer, Integer> memo = new HashMap<>();
            for (int num : nums) {
                memo.put(num, memo.getOrDefault(num, 0) + 1);
            }
            int[] result = new int[2];
            int index = 0;
            for (Map.Entry<Integer, Integer> entry : memo.entrySet()) {
                if (entry.getValue() == 1) {
                    result[index++] = entry.getKey();
                }
            }
            return result;
        }
    }

}
