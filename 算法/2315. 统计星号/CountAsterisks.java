
public class CountAsterisks {

    class Solution {

        public int countAsterisks(String s) {
            boolean flag = true;
            int result = 0;
            for (int i = 0; i < s.length(); i++) {
                char value = s.charAt(i);
                if (value == '|') {
                    flag = !flag;
                } else if (value == '*' && flag) {
                    result++;
                }
            }
            return result;
        }

    }

}
