
public class CountHomogenous {

    class Solution {
        public int countHomogenous(String s) {
            int len = s.length();
            int mod = 1000000007;
            long count = 0;
            int left = 0;
            int right = 0;
            // 双指针
            while (right < len) {
                while (right < len && s.charAt(left) == s.charAt(right)) {
                    right++;
                }
                long n = right - left;
                count = (count + (1 + n) * n / 2) % mod;
                left = right;
            }
            return (int) (count % mod);
        }

        public int countHomogenous1(String s) {
            int ans = 0;
            int left = 0;
            int right = 0;
            while (right < s.length()) {
                if (s.charAt(right) != s.charAt(left)) {
                    left = right;
                }
                ans = (ans + (right - left + 1)) % 1000000007;
                right++;
            }
            return ans;
        }

    }

}

