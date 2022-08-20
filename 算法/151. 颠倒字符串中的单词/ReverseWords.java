

public class ReverseWords {

    class Solution {
        public String reverseWords(String s) {
            String[] ch = s.split(" ");
            String str = "";
            for (int i = ch.length - 1; i >= 0; i--) {
                if (!ch[i].isEmpty()) {
                    str += ch[i] + " ";
                }
            }
            return str.trim();
        }

    }

}
