import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href = "kamtohung@gmail.com">KamTo Hung</a>
 */
public class GenerateParenthesis {

    class Solution {

        List<String> result = new ArrayList<>();

        public List<String> generateParenthesis(int n) {
            dfs(new StringBuilder(), n, n);
            return result;
        }

        private void dfs(StringBuilder str, int left, int right) {
            if (left == 0 && right == 0) {
                result.add(str.toString());
                return;
            }
            if (left > 0) {
                StringBuilder appendLeft = str.append("(");
                dfs(appendLeft, left - 1, right);
                appendLeft.deleteCharAt(appendLeft.length() - 1);
            }
            if (right > 0) {
                StringBuilder appendRight = str.append(")");
                dfs(appendRight, left, right - 1);
                appendRight.deleteCharAt(appendRight.length() - 1);
            }
        }

    }

}
