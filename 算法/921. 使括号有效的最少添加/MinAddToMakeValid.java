
public class MinAddToMakeValid {

    class Solution {

        public int minAddToMakeValid(String s) {
            int left = 0;
            int right = 0;
            for (char ch : s.toCharArray()) {
                if (ch == '(') {
                    left++;
                } else {
                    if (left >0) {
                        left--;
                    } else {
                        right++;
                    }
                }
            }
            return left + right;
        }

    }

}
