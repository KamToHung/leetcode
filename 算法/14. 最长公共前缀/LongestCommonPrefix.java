public class LongestCommonPrefix {

    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) {
                return "";
            }
            String prefix = strs[0];
            for (String str : strs) {
                while (!str.startsWith(prefix)) {
                    if (prefix.length() == 1) {
                        return "";
                    }
                    prefix = prefix.substring(0,prefix.length()-1);
                }
            }
            return prefix;
        }
    }

}
