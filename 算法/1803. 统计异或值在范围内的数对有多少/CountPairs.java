
public class CountPairs {

    class Solution {
        public int countPairs(int[] nums, int low, int high) {
            // 只会暴力...囧
            int result = 0;
            // 这里可以少循环一次
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    int xor = nums[i] ^ nums[j];
                    if (xor >= low && xor <= high) {
                        result++;
                    }
                }
            }
            return result;
        }
    }

}
