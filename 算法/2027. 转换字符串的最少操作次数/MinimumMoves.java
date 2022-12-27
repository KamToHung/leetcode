
public class MinimumMoves {

    class Solution {
        public int minimumMoves(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }
            int result = 0;
            int i = 0;
            while (i < s.length()) {
                if (s.charAt(i) == 'X') {
                    i += 3;
                    result++;
                } else {
                    i++;
                }
            }
            return result;
        }
    }

}
