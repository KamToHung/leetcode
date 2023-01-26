import java.util.Arrays;

public class GetSmalllestString {

    class Solution {

        public String getSmallestString(int n, int k) {
            // 首先先把n个位置都填充a，然后从最后一个位置往前一个个填充即可
            char[] chs = new char[n];
            // 填充a
            Arrays.fill(chs, 'a');
            // 减少k值
            k = k - 1 * n;
            int pos = 1;
            // 往后填充
            while (k != 0) {
                // 如果k大于等于25，即为'z'，则替换成z然后k-25
                if (k >= 25) {
                    k = k - 25;
                    chs[n - pos] += 25;
                    pos++;
                } else {
                    // 这时候k不足'z'，直接取剩余的数即可
                    chs[n - pos] += k;
                    break;
                }
            }
            return String.valueOf(chs);
        }

    }

}
