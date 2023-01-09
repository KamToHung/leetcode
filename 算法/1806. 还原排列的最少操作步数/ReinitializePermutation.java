import java.util.Arrays;

public class ReinitializePermutation {

    class Solution {
        public int reinitializePermutation(int n) {
            // 已知数组
            int[] perm = new int[n];
            // 目标数组
            int[] target = new int[n];
            // 赋值
            for (int i = 0; i < n; i++) {
                perm[i] = i;
                target[i] = i;
            }
            int result = 0;
            // 循环，直到perm == target位置。不过为了防止死循环，可以设置一个大count
            int count = 0;
            while (true) {
                int[] nums = new int[n];
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        nums[i] = perm[i / 2];
                    } else {
                        nums[i] = perm[n / 2 + (i - 1) / 2];
                    }
                }
                perm = nums;
                result++;
                // 如果和目标数组相等则可以中断结束
                if (Arrays.equals(perm, target)) {
                    break;
                }
                if (count >= 10000) {
                    break;
                }
                count++;
            }
            return result;
        }
    }
}
