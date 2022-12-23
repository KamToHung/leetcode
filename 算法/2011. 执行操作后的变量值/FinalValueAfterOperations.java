
public class FinalValueAfterOperations {

    class Solution {
        public int finalValueAfterOperations(String[] operations) {
            if (operations == null || operations.length == 0) {
                return 0;
            }
            int result = 0;
            for (String operation : operations) {
                if (operation.equals("X++") || operation.equals("++X")) {
                    result++;
                } else {
                    result--;
                }
            }
            return result;
        }
    }

}
