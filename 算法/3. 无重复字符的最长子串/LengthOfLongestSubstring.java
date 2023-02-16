import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {

    class Solution {
        public int lengthOfLongestSubstring(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }
            Map<Character, Integer> memo = new HashMap<>();
            int result = 0;
            int left = 0;
            int right = 0;
            // 循环查询最长不重复字符串
            for (int i = 0; i < s.length(); i++) {
                char value = s.charAt(i);
                memo.put(value, memo.getOrDefault(value, 0) + 1);
                // 判断是否有重复，有的话left到不重复为止
                while (memo.get(value) > 1) {
                    char leftValue = s.charAt(left);
                    // 计数扣减
                    memo.put(leftValue, memo.getOrDefault(leftValue, 0) - 1);
                    left++;
                }
                result = Math.max(result, right - left + 1);
                right++;
            }
            return result;
        }
    }

}
