import java.util.Arrays;

/**
 * @author <a href = "kamtohung@gmail.com">KamTo Hung</a>
 */
public class GetMaximumConsecutive {

    class Solution {

        public int getMaximumConsecutive(int[] coins) {
            int result = 1;
            // 从小到大排序
            Arrays.sort(coins);
            for (int coin : coins) {
                if (coin > result) {
                    break;
                }
                result += coin;
            }
            return result;
        }

    }

}
