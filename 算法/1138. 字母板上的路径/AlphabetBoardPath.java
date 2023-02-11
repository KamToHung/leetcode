/**
 * @author <a href = "kamtohung@gmail.com">KamTo Hung</a>
 */
public class AlphabetBoardPath {

    class Solution {

        public String alphabetBoardPath(String target) {
            StringBuilder result = new StringBuilder();
            int x = 0;
            int y = 0;
            for (char ch: target.toCharArray()) {
                // 目标位置
                int curX = (ch - 'a') / 5;
                int curY = (ch - 'a') % 5;
                // 竖直方向
                String strX = x > curX ? repeat("U", x - curX) : repeat("D", curX - x);
                // 水平方向
                String strY = y > curY ? repeat("L", y - curY) : repeat("R", curY - y);
                if (ch == 'z') {
                    result.append(strY).append(strX).append('!');
                } else {
                    result.append(strX).append(strY).append('!');
                }
                // 当前位置
                x = curX;
                y = curY;
            }
            return result.toString();
        }

        private String repeat(String str, int count) {
            StringBuilder builder = new StringBuilder(str.length() * count);
            for (int i = 0; i < count; i++) {
                builder.append(str);
            }
            return builder.toString();
        }

    }

}
