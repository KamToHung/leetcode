import java.util.HashSet;
import java.util.Set;

public class GreatestLetter {

    class Solution {
        public String greatestLetter(String s) {
            Set<Character> memo = new HashSet<>();
            for (char ch : s.toCharArray()) {
                memo.add(ch);
            }
            // 循环26个英文字母
            for (int i = 25; i >= 0; i--) {
                char low = (char) ('a' + i);
                char upper = (char) ('A' + i);
                if (memo.contains(low) && memo.contains(upper)) {
                    return String.valueOf(upper);
                }
            }
            return "";
        }

    }

}
