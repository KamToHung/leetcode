public class IsPalindrome {

    class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0 || (x != 0 && x % 10 == 0)) {
                return false;
            }
            int temp = x;
            int num = 0;
            while(temp > 0) {
                num = num * 10 + temp % 10;
                temp = temp / 10;
            }
            return num == x;
        }
    }
}
