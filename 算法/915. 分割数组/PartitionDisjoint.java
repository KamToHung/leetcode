
public class PartitionDisjoint {

    class Solution {
        public int partitionDisjoint(int[] nums) {
            int pos = 0;
            int curMax = nums[0];
            int leftMax = nums[0];
            for (int i = 0; i < nums.length; i++) {
                int value = nums[i];
                // 当前最大值
                curMax = Math.max(curMax, value);
                // 如果左边最大值大于当前值，则pos为i才能保证所有左边的值小于右边
                if (value < leftMax) {
                    pos = i;
                    leftMax = curMax;
                }
            }
            return pos + 1;
        }
    }

}
