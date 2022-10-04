
public class LongestValidParentheses {

    class Solution {

        public int longestValidParentheses(String s) {
            int left = 0;
            int right = 0;
            int max = 0;
            // 左往右，考虑右边括号大于左边的情况
            for (char ch : s.toCharArray()) {
                if (ch == '(') {
                    left++;
                } else {
                    right++;
                }
                if (left == right) {
                    max = Math.max(max, left + right);
                }
                if (left < right) {
                    left = 0;
                    right = 0;
                }
            }
            left = 0;
            right = 0;
            // 右往左，考虑左边括号大于右边的情况
            for (int i = s.length() - 1; i >= 0; i--) {
                char ch = s.charAt(i);
                if (ch == '(') {
                    left++;
                } else {
                    right++;
                }
                if (left == right) {
                    max = Math.max(max, left + right);
                }
                if (left > right) {
                    left = 0;
                    right = 0;
                }
            }
            return max;
        }

    }

}
