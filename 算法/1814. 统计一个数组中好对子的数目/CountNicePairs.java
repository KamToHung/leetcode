import java.util.HashMap;
import java.util.Map;


public class CountNicePairs {

    class Solution {

        public int countNicePairs(int[] nums) {
            Map<Integer, Integer> memo = new HashMap<>();
            int mod = 1000000007;
            int result = 0;
            for(int i = 0; i < nums.length; i++) {
                int curNum = nums[i];
                // 翻转数字
                int revCurNum = rev(curNum);
                // nums[i] + rev(nums[j]) == nums[j] + rev(nums[i]) 得:
                // nums[i] - rev(nums[i]) == nums[j] - rev(nums[j])
                // 所以:
                int t = curNum - revCurNum;
                // 之前存在的数量
                int memoValue = memo.getOrDefault(t, 0);
                result = (result + memoValue) % mod;
                // 放进memo里面，如果下次循环发现有相同值则增加
                memo.put(t, memoValue + 1);
            }
            return result;
        }

        // 翻转
        private int rev(int num) {
            int n = num;
            int result = 0;
            while (n != 0) {
                result = result * 10 + n % 10;
                n = n/10;
            }
            return result;
        }

    }

}
