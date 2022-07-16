public class IsSubsequence {

    class Solution {
        public boolean isSubsequence(String s, String t) {
            if (s.length() > t.length()) {
                return false;
            }
            char[] childChar = s.toCharArray();
            char[] parentChar = t.toCharArray();
            int count = 0;
            int childStart = 0;
            int parentStart = 0;
            while (childStart < childChar.length && parentStart < parentChar.length) {
                if (childChar[childStart] == parentChar[parentStart]) {
                    childStart++;
                    parentStart++;
                    count++;
                } else {
                    parentStart++;
                }
            }
            return count == childChar.length;
        }
    }

}
