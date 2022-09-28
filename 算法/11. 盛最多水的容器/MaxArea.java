
public class MaxArea {

    class Solution {
        public int maxArea(int[] height) {
            int max = 0;
            int left = 0;
            int right = height.length - 1;
            while(left < right) {
                int leftHeight = height[left];
                int rightHeight = height[right];
                if(leftHeight > rightHeight) {
                    int curArea = rightHeight * (right - left);
                    max = Math.max(max, curArea);
                    right--;
                } else {
                    int curArea = leftHeight * (right - left);
                    max = Math.max(max, curArea);
                    left++;
                }
            }
            return max;
        }
    }

}
