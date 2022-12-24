
public class LargestMerge {

    class Solution {
        public String largestMerge(String word1, String word2) {
            int len1 = word1.length();
            int len2 = word2.length();
            StringBuilder builder = new StringBuilder(len1 + len2);
            int i = 0;
            int j = 0;
            // 遍历
            while (i < len1 && j < len2) {
                String value1 = word1.substring(i);
                String value2 = word2.substring(j);
                if (value1.compareTo(value2) > 0) {
                    builder.append(word1.charAt(i));
                    i++;
                } else {
                    builder.append(word2.charAt(j));
                    j++;
                }
            }
            // 遍历完后还有剩下
            if (i != len1 && j == len2) {
                builder.append(word1, i, len1);
            } else if (i == len1 && j != len2) {
                builder.append(word2, j, len2);
            }
            return builder.toString();
        }

    }

}
