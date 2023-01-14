
public class MinMaxGame {

    class Solution {

        public int minMaxGame(int[] nums) {
            int len = nums.length;
            // 当长度不为1时代表还能缩半
            while (len != 1) {
                int m = len / 2;
                for (int i = 0; i < m; i++) {
                    // 如果为偶数
                    if (i % 2 == 0) {
                        nums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
                    } else {
                        // 否则为奇数
                        nums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
                    }
                }
                // 长度缩减一半
                len = m;
            }
            return nums[0];
        }

        public int minMaxGame1(int[] nums) {
            // 使用递归
            // 出口
            int len = nums.length;
            if (len == 1) {
                return nums[0];
            }
            // 新数组长度
            int newLen = len / 2;
            // 构建新数组
            int[] newNums = new int[newLen];
            // 按照题目逻辑处理
            for (int i = 0; i < newLen; i++) {
                if (i % 2 == 0) {
                    newNums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
                } else {
                    newNums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
                }
            }
            return minMaxGame1(newNums);
        }

    }

}
