
public class MissingNumber {

    class Solution {

        public int missingNumber(int[] nums) {
            // 与0~n的数进行异或运算即可
            int result = nums[0];
            for (int i = 1; i < nums.length; i++) {
                result ^= nums[i];
            }
            for (int i = 0; i <= nums.length; i++) {
                result ^= i;
            }
            return result;
        }

    }

}
