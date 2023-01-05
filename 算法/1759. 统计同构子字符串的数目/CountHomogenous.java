public class CountHomogenous {

    class Solution {
        public int countHomogenous(String s) {
            // 由例子可知，连续相同字符的结果为x=1+2+3+...+n=n*(n+1)/2,所以我们只要拿到每次连续字符的长度并计算出x,然后再加起来即可，这里可以使用双指针来完成
            int len = s.length();
            int mod = 1000000007;
            // 这里要设置为long，不然n*(n+1)有可能越界
            long count = 0;
            int left = 0;
            int right = 0;
            // 双指针
            while (right < len) {
                // 当小于长度并且字符相等的时候，right+1，那么此时得到的结果就是连续相同字符的长度n=right-left
                while (right < len && s.charAt(left) == s.charAt(right)) {
                    right++;
                }
                long n = right - left;
                // 加起来
                count += (1 + n) * n / 2;
                left = right;
            }
            return (int) (count % mod);
        }

        public int countHomogenous1(String s) {
            // 另外一种方式，每次相同的时候加上长度即是结果
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