/**
 * @author <a href = "kamtohung@gmail.com">KamTo Hung</a>
 */
public class LongestWPI {

    class Solution {


        /**
         * 穷举
         */
        public int longestWPI(int[] hours) {
            int result = 0;
            for (int i = 0; i < hours.length; i++) {
                int flag = 0;
                for (int j = i; j < hours.length; j++) {
                    if (hours[j] > 8) {
                        flag++;
                    } else {
                        flag--;
                    }
                    // 大于0代表表现良好的时间段
                    if (flag > 0) {
                        result = Math.max(result, j - i + 1);
                    }
                }
            }
            return result;
        }
    }

}
