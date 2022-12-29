import java.util.ArrayList;
import java.util.List;

public class TwoOutOfThree {

    class Solution {

        public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
            List<Integer> result = new ArrayList<>();
            int[] memo = new int[101];
            for (int x : nums1) memo[x] = 1;
            for (int x : nums2) {
                if (memo[x] == 1) {
                    memo[x] = -1;
                    result.add(x);
                } else if (memo[x] == 0) {
                    memo[x] = 2;
                }
            }
            for (int x : nums3) {
                if (memo[x] == 1 || memo[x] == 2) {
                    memo[x] = -1;
                    result.add(x);
                }
            }
            return result;
        }
    }

}
