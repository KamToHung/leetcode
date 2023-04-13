import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href = "kamtohung@gmail.com">KamTo Hung</a>
 */
public class MostFrequentEven {

    class Solution {
        public int mostFrequentEven(int[] nums) {
            Map<Integer, Integer> memo = new HashMap<>();
            for (int num : nums) {
                if ((num & 1) == 0) {
                    memo.put(num, memo.getOrDefault(num, 0) + 1);
                }
            }
            int result = -1;
            int maxCount = 0;
            for (int num : memo.keySet()) {
                int count = memo.get(num);
                if (count > maxCount || (count == maxCount && num < result)) {
                    result = num;
                    maxCount = count;
                }
            }
            return result;
        }
    }

}
