/**
 * miss README
 */
public class RepeatedCharacter {

    class Solution {
        public char repeatedCharacter(String s) {
            if (s == null || s.length() == 0) {
                return '0';
            }
            // 用一个数组来存储每个字母出现的次数
            int[] memo = new int[26];
            for (char ch : s.toCharArray()) {
                if (memo[ch - 'a'] == 1) {
                    return ch;
                }
                memo[ch - 'a']++;
            }
            return '0';
        }
    }

}
