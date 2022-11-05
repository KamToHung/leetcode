import java.util.Stack;

public class ParseBoolExpr {

    class Solution {

        // 涉及到括号的一般使用栈容易解决
        public boolean parseBoolExpr(String expression) {
            Stack<Character> stack = new Stack<>();
            for (char c : expression.toCharArray()) {
                if (c == ',') {
                    continue;
                } else if (c != ')') {
                    stack.push(c);
                } else {
                    int t = 0;
                    int f = 0;
                    while (stack.peek() != '(') {
                        char value = stack.pop();
                        if (value == 't') {
                            t++;
                        } else {
                            f++;
                        }
                    }
                    // 弹出左括号
                    stack.pop();
                    char op = stack.pop();
                    switch (op) {
                        case '!':
                            stack.push(f== 1 ? 't' : 'f');
                            break;
                        case '&':
                            stack.push(f == 0 ? 't' : 'f');
                            break;
                        case '|':
                            stack.push(t > 0 ? 't' : 'f');
                            break;
                    }
                }
            }
            return stack.pop() == 't';
        }

    }

}
