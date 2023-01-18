
public class AreSentencesSimilar {

    class Solution {

        public boolean areSentencesSimilar(String sentence1, String sentence2) {
            String[] p = sentence1.split(" ");
            String[] q = sentence2.split(" ");
            int i = 0;
            int j = 0;
            // 从头开始遍历相同则+1
            while (i < p.length && i < q.length && p[i].equals(q[i])) {
                i++;
            }
            // 从尾开始遍历相同则+1,遍历次数为最小长度-i
            while (j < p.length - i && j < q.length - i && p[p.length - 1 - j].equals(q[q.length - 1 - j])) {
                j++;
            }
            return i + j == Math.min(p.length, q.length);
        }

    }

}
