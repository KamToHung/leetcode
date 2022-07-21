public class Reverse {

    class Solution {
        public int reverse(int x) {
            long n = 0;
            while(x != 0) {
                int a = x % 10;
                n = n * 10 + a;
                x = x / 10;
            }
            return (int) n == n ? (int)n : 0;
        }
    }
    
}
