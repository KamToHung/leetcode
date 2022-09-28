
public class CountSubstrings {

    class Solution {

        public int countSubstrings(String s) {
            // 动态规划f(x,y) = f(x+1,y-1)
            // 出口v(x) = v(y) and y -v < 3, f(x,y) = true
            int len = s.length();
            boolean[][] dp = new boolean[len][len];
            int sum = 0;
            for(int j = 0;j < len; j++) {
                char rightChar = s.charAt(j);
                for(int i = 0; i <= j; i++) {
                    char leftChar = s.charAt(i);
                    if (rightChar == leftChar) {
                        if(j - i < 3) {
                            dp[i][j] = true;
                        } else {
                            dp[i][j] = dp[i+1][j-1];
                        }
                        if(dp[i][j]) {
                            sum++;
                        }
                    } else {
                        dp[i][j] = false;
                    }
                }
            }
            return sum;
        }

    }

}
