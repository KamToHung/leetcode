
public class FindMaxConsecutiveOnes {

    class Solution {

        public int findMaxConsecutiveOnes(int[] nums) {
            int max = 0;
            int count = 0;
            for (int curValue : nums) {
                if (curValue == 0) {
                    count = 0;
                    continue;
                }
                count++;
                max = Math.max(max, count);
            }
            return max;
        }

    }

}
