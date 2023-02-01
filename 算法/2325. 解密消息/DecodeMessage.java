
public class DecodeMessage {

    class Solution {

        public String decodeMessage(String key, String message) {
            char[] chs = new char[26];
            char curChar = 'a';
            for (char i : key.toCharArray()) {
                if (i != ' ' && chs[i - 'a'] == 0) {
                    chs[i - 'a'] = curChar;
                    curChar++;
                }
            }
            char[] result = message.toCharArray();
            for (int i = 0; i < result.length; i++) {
                if (result[i] != ' ') {
                    result[i] = chs[result[i] - 'a'];
                }
            }
            return new String(result);
        }

    }

}
