
public class MinArray {

    class Solution {
        public int minArray(int[] numbers) {
            int left = 0;
            int right = numbers.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                int value = numbers[mid];
                int rightValue = numbers[right];
                if (value < rightValue) {
                    right = mid;
                } else if (value > rightValue) {
                    left = mid + 1;
                } else {
                    right--;
                }
            }
            return numbers[left];
        }
    }

}
