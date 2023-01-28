
public class WaysToMakeFair {

    class Solution {

        public int waysToMakeFair(int[] nums) {
            // 这里的奇数/偶数是相对于没有删除时对应的奇数/偶数
            // 要删除索引右边的偶数和
            int sumReven = 0;
            // 要删除索引右边的奇数和
            int sumRodd = 0;

            // 要删除索引左边的偶数和
            int sumLeven = 0;
            // 要删除索引左边的奇数和
            int sumLodd = 0;
            for (int i = 0; i < nums.length; i++) {
                if ((i & 1) == 0) {
                    // 偶数和
                    sumReven += nums[i];
                } else {
                    // 奇数和
                    sumRodd += nums[i];
                }
            }
            int result = 0;
            // 删除第一个元素
            sumReven -= nums[0];
            // 如果此时相等则+1
            if (sumReven == sumRodd) {
                result++;
            }
            for (int i = 1; i < nums.length; i++) {
                if ((i & 1) == 0) {
                    // 当为偶数位置的时候，sumReven减去此元素
                    sumReven -= nums[i];
                    // 把上次删除的奇数加回来
                    sumLodd += nums[i - 1];
                } else {
                    // 当为奇数位置的时候，sumRodd减去此元素
                    sumRodd -= nums[i];
                    // 把上次删除的偶数加回来
                    sumLeven += nums[i - 1];
                }
                // 删除了一个元素后，sumReven和sumRodd就会互换，所以此条件满足题意
                if (sumReven + sumLodd == sumLeven + sumRodd) {
                    result++;
                }
            }
            return result;
        }

    }

}
