
public class SortColors {

    class Solution {

        public void sortColors(int[] nums) {
            //红放在前面，蓝放在后面
            int red = 0;
            int blue = nums.length - 1;
            for (int i = 0; i < nums.length; i++) {
                int value = nums[i];
                if (value == 0) {
                    // 放在前面
                    swap(nums, i, red);
                    red++;
                } else if (value == 2) {
                    if (blue == i - 1) {
                        // 蓝色已经在后面了
                        break;
                    }
                    // 放在后面
                    swap(nums, i, blue);
                    blue--;
                }
            }
        }

        private void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

    }

}
