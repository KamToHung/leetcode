import java.util.Stack;

public class IsValid {

    class Solution {
        public boolean isValid(String s) {
            if (s == null || s.equals("")) {
                return true;
            }
            char[] chs = s.toCharArray();
            if (chs.length % 2 == 1) {
                return false;
            }
            Stack<Character> stack = new Stack<>();
            stack.push(chs[0]);
            for(int i = 1; i < chs.length; i++) {
                char ch = chs[i];
                if (!stack.isEmpty() && validChar(stack.peek(), ch)) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
            return stack.isEmpty();
        }

        private boolean validChar(char c1, char c2) {
            return (c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}');
        }
    }

}
