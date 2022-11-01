
public class ArrayStringsAreEqual {

    class Solution {
        public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            // word1的指针
            int p = 0;
            // word2的指针
            int q = 0;
            // word1的下标
            int index1 = 0;
            // word2的下标
            int index2 = 0;
            while (index1 < word1.length && index2 < word2.length) {
                if (word1[index1].charAt(p) != word2[index2].charAt(q)) {
                    return false;
                }
                p++;
                q++;
                if (p == word1[index1].length()) {
                    index1++;
                    p = 0;
                }
                if (q == word2[index2].length()) {
                    index2++;
                    q = 0;
                }
            }
            return index1 == word1.length && index2 == word2.length;
        }

    }

}
