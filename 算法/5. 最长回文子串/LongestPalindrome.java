
public class LongestPalindrome {

    class Solution {
        public String longestPalindrome(String s) {
            if (s == null) {
                return null;
            }
            if (s.length() < 2) {
                return s;
            }
            int len = s.length();
            // 动态规划处理
            boolean[][] dp = new boolean[len][len];
            int start = 0;
            int length = 1;
            for (int j = 1; j < s.length(); j++) {
                // 右边
                char rightCh = s.charAt(j);
                for (int i = 0; i < j; i++) {
                    // 左边
                    char leftCh = s.charAt(i);
                    // 如果左右不能肯定不是回文数
                    if (rightCh != leftCh) {
                        dp[i][j] = false;
                    } else {
                        if (j - i <= 2) {
                            dp[i][j] = true;
                        } else {
                            dp[i][j] = dp[i + 1][j - 1];
                        }
                    }
                    // 如果为true,记录最长长度
                    if (dp[i][j]) {
                        if (length < j - i + 1) {
                            start = i;
                            length = j - i + 1;
                        }
                    }
                }
            }
            return s.substring(start, start + length);
        }
    }

}
