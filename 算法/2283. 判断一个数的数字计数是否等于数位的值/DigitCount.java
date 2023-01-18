import java.util.HashMap;
import java.util.Map;

public class DigitCount {

    class Solution {
        public boolean digitCount(String num) {
            Map<Integer, Integer> memo = new HashMap<>();
            int n = num.length();
            for (int i = 0; i < n; i++) {
                int digit = num.charAt(i) - '0';
                memo.put(digit, memo.getOrDefault(digit, 0) + 1);
            }
            for (int i = 0; i < n; i++) {
                int value = num.charAt(i) - '0';
                if (memo.getOrDefault(i, 0) != value) {
                    return false;
                }
            }
            return true;
        }
    }

}
