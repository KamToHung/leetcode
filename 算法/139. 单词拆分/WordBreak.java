import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author <a href = "mailto:kamtohung@gmail.com">KamTo Hung</a>
 */
public class WordBreak {

    static class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {
            Set<String> memo = new HashSet<>(wordDict);
            // 状态转移方程式
            // f(x) = f(y)&&check(s[y...x-1])
            boolean[] dp = new boolean[s.length() + 1];
            dp[0] = true;
            for (int i = 1; i < s.length() + 1; i++) {
                for (int j = 0; j < i; j++) {
                    if (dp[j] && memo.contains(s.substring(j, i))) {
                        dp[i] = true;
                        break;
                    }
                }
            }
            return dp[s.length()];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");
        System.out.println(solution.wordBreak("leetcode", list));
    }
}
