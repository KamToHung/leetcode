
public class LongestPalindrome {

    class Solution {
        public String longestPalindrome1(String s) {
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

        // 暴力
        public String longestPalindrome2(String s) {
            int maxLen = 0;
            String result = "";
            for (int j = 1; j <= s.length(); j++) {
                for (int i = 0; i < j; i++) {
                    String cur = s.substring(i, j);
                    if (isPalindrome(cur) && cur.length() > maxLen) {
                        result = cur;
                        maxLen = cur.length();
                    }
                }
            }
            return result;
        }


        public boolean isPalindrome(String s) {
            int left = 0;
            int right = s.length() - 1;
            while (left < right) {
                char leftChar = s.charAt(left);
                char rightChar = s.charAt(right);
                if (leftChar != rightChar) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }

        // 中心扩展
        public String longestPalindrome(String s) {
            String result = "";
            for (int i = 0; i < s.length(); i++) {
                String oneEvent = maxPalindrome(s, i, i);
                String twoEvent = maxPalindrome(s, i, i + 1);
                String theMax = oneEvent.length() > twoEvent.length() ? oneEvent : twoEvent;
                if (result.length() < theMax.length()) {
                    result = theMax;
                }
            }
            return result;
        }

        public String maxPalindrome(String s, int left, int right) {
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            return s.substring(left + 1, right);
        }


    }

}
