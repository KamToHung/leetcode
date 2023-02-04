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

    public static void main(String[] args) {
        GetMaximumConsecutive getMaximumConsecutive = new GetMaximumConsecutive();
        Solution solution = getMaximumConsecutive.new Solution();
        int[] coins = {0, 1, 2};
        System.out.println(solution.getMaximumConsecutive(coins));
    }

}
