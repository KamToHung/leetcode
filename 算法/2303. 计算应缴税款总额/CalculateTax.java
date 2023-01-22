
public class CalculateTax {

    class Solution {
        public double calculateTax(int[][] brackets, int income) {
            double sum = 0d;
            double lastNumber = 0d;
            for (int[] bracket : brackets) {
                if (bracket[0] >= income) {
                    // 如果大于收入
                    sum += (income - lastNumber) * bracket[1] / 100;
                    break;
                } else {
                    // 如果小于收入则需要计算
                    sum += (bracket[0] - lastNumber) * bracket[1] / 100;
                    lastNumber = bracket[0];
                }
            }
            return sum;
        }
    }

}
