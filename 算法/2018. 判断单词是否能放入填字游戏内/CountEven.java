public class CountEven {

    class Solution {
        public int countEven(int num) {
            int result = 0;
            for (int i = 2; i <= num; i++) {
                if (match(i)) {
                    result++;
                }
            }
            return result;
        }

        public boolean match(int num) {
            // 判断数字是否匹配
            // 12=1+2=3不符合 13=1+3=4符合
            int tmp = 0;
            while (num > 0) {
                tmp += num % 10;
                num /= 10;
            }
            // 余数为0则为偶数
            return tmp % 2 == 0;
        }

    }

}
