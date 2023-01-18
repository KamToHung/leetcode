import java.util.Arrays;

public class CountDifferentSubsequenceGCDs {

    class Solution {

        // https://leetcode.cn/problems/number-of-different-subsequences-gcds/solutions/2060230/xu-lie-zhong-bu-tong-zui-da-gong-yue-shu-ha1j/
        public int countDifferentSubsequenceGCDs(int[] nums) {
            int maxVal = Arrays.stream(nums).max().getAsInt();
            boolean[] occured = new boolean[maxVal + 1];
            for (int num : nums) {
                occured[num] = true;
            }
            int ans = 0;
            for (int i = 1; i <= maxVal; i++) {
                int subGcd = 0;
                for (int j = i; j <= maxVal; j += i) {
                    if (occured[j]) {
                        if (subGcd == 0) {
                            subGcd = j;
                        } else {
                            subGcd = gcd(subGcd, j);
                        }
                        if (subGcd == i) {
                            ans++;
                            break;
                        }
                    }
                }
            }
            return ans;
        }

        public int gcd(int num1, int num2) {
            while (num2 != 0) {
                int temp = num1;
                num1 = num2;
                num2 = temp % num2;
            }
            return num1;
        }
    }

}
