
public class ArraySign {

    class Solution {
        public int arraySign(int[] nums) {
            //是否正数
            boolean flag = true;
            for(int num : nums) {
                if (num == 0) {
                    return 0;
                }
                if (num < 0) {
                    flag = !flag;
                }
            }
            return flag ? 1 : -1;
        }
    }

}
