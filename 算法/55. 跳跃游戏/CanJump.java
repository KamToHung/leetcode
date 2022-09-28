
public class CanJump {

    class Solution {

        public boolean canJump(int[] nums) {
            // 保证在下表位置的那个点的最大值能到达终点
            int max = 0;
            for (int i = 0; i < nums.length; i++) {
                max = Math.max(max, nums[i] + i);
                if (max >= nums.length - 1) {
                    return true;
                }
                if (max <= i) {
                    return false;
                }
            }
            return false;
        }

    }

}
