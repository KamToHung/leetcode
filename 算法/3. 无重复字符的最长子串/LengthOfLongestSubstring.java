import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {

    class Solution {
        public int lengthOfLongestSubstring(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }
            Map<Character, Integer> memo = new HashMap<>();
            int left = 0;
            int right = 0;
            int max = 1;
            char[] chs = s.toCharArray();
            while (right < s.length()) {
                char value = chs[right];
                int count = memo.getOrDefault(value, 0);
                memo.put(value, count + 1);
                while (memo.get(value) > 1) {
                    char leftValue = chs[left];
                    int leftCount = memo.getOrDefault(leftValue, 0);
                    memo.put(leftValue, leftCount - 1);
                    left++;
                }
                max = Math.max(max, right - left + 1);
                right++;
            }
            return max;
        }
    }

}
