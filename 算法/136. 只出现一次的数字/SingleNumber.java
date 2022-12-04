
public class SingleNumber {

    class Solution {

        public int singleNumber(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            // 异或运算,a^0=a,a^a=0
            int value = nums[0];
            for (int i = 1; i < nums.length; i++) {
                value ^= nums[i];
            }
            return value;
        }

    }

}
