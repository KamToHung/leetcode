
public class MinimumLength {

    class Solution {
        public int minimumLength(String s) {
            // 双指针，以左边left为标准，相等则left+1,right-1,最终结果为right-left+1
            if (s == null || s.length() == 0) {
                return 0;
            }
            int left = 0;
            int right = s.length() - 1;
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    break;
                }
                char value = s.charAt(left);
                while (left <= right && s.charAt(left) == value) {
                    left++;
                }
                while (left <= right && s.charAt(right) == value) {
                    right--;
                }
            }
            return right - left + 1;
        }
    }

}
