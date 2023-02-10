import java.util.Arrays;

/**
 * @author <a href = "kamtohung@gmail.com">KamTo Hung</a>
 */
public class FillCups {

    class Solution {
        public int fillCups(int[] amount) {
            Arrays.sort(amount);
            if (amount[2] > amount[1] + amount[0]) {
                return amount[2];
            }
            return (amount[0] + amount[1] + amount[2] + 1) / 2;
        }
    }

}
