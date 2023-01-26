import java.util.Arrays;

public class GetSmalllestString {

    class Solution {

        public String getSmalllestString(int n, int k) {
            // 首先先把n个位置都填充a，然后从最后一个位置往前一个个填充即可
            char[] chs = new char[n];
            // 填充a
            Arrays.fill(chs, 'a');
            // 减少k值
            k = k - 1 * n;
            int pos = 1;
            // 往后填充
            // 也可以优化为批量处理，判断k的值是否大于等于25(因为本来初始化已经扣掉1(a)了)
            while (k != 0) {
                chs[n - pos]++;
                k--;
                // 如果等于z了往前移
                if (chs[n - pos] == 'z') {
                    pos++;
                }
            }
            return String.valueOf(chs);
        }

    }

}
