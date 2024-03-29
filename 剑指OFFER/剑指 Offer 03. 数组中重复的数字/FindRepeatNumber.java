import java.util.HashSet;
import java.util.Set;


public class FindRepeatNumber {

    class Solution {

        public int findRepeatNumber(int[] nums) {
            // 使用set即可
            Set<Integer> set = new HashSet<>();
            for (int value : nums) {
                if (set.contains(value)) {
                    return value;
                }
                set.add(value);
            }
            return 0;
        }

    }

}
