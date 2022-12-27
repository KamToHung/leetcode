
public class PrintNumbers {

    class Solution {
        public int[] printNumbers(int n) {
            int end = (int)Math.pow(10, n) - 1;
            int[] result = new int[end];
            for (int i = 0; i < end; i++) {
                result[i] = i + 1;
            }
            return result;
        }
    }
    
}
