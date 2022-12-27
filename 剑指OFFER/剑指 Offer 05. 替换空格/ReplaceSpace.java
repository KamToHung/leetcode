
public class ReplaceSpace {

    class Solution {
        public String replaceSpace(String s) {
            StringBuilder builder = new StringBuilder();
            char[] chs = s.toCharArray();
            for(int i=0;i<chs.length;i++) {
                if(chs[i] == ' ') {
                    builder.append("%20");
                } else {
                    builder.append(chs[i]);
                }
            }
            return builder.toString();
        }
    }

}
