import java.util.Stack;

public class LongestValidParentheses {

    static class Solution {

        public int longestValidParentheses(String s) {
            int max = 0;
            Stack<Integer> stack = new Stack<>();
            stack.push(-1);
            for (int i = 0; i < s.length(); i++) {
                char curValue = s.charAt(i);
                if (curValue == '(') {
                    stack.push(i);
                } else {
                    stack.pop();
                    if (stack.isEmpty()) {
                        stack.push(i);
                    } else {
                        max = Math.max(max, i - stack.peek());
                    }
                }
            }
            return max;
        }

        public static void main(String[] args) {
            Solution solution = new Solution();
            System.out.println(solution.longestValidParentheses("()(())))())()"));
        }

        public int longestValidParentheses1(String s) {
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
