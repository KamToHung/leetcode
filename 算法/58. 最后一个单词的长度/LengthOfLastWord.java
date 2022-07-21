public class LengthOfLastWord {

    class Solution {
        public int lengthOfLastWord(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }
            s = s.trim();
            int len = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                char ch = s.charAt(i);
                if (ch == ' ') {
                    break;
                }
                len++;
            }
            return len;
        }
    }

}
