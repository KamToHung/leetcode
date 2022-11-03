
public class MaxRepeating {

    class Solution {

        public int maxRepeating(String sequence, String word) {
            // 状态转移方程式:f(x) = f(x-i) + 1
            int[] dp = new int[sequence.length() + 1];
            int wordLen = word.length();
            int result = 0;
            for (int i = 0; i <= sequence.length(); i++) {
                // 太短则跳过
                if (i - wordLen < 0) {
                    continue;
                }
                if (sequence.substring(i - wordLen, i).equals(word)) {
                    dp[i] = dp[i - wordLen] + 1;
                }
                result = Math.max(result, dp[i]);
            }
            return result;
        }

    }

}
