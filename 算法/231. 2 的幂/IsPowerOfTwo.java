
public class IsPowerOfTwo {

    class Solution {
        public boolean isPowerOfTwo(int n) {
            // n & (n - 1) 可以判断一个数是否2的幂
            return n > 0 && (n & (n - 1)) == 0;
        }
    }

}
