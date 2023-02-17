import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href = "kamtohung@gmail.com">KamTo Hung</a>
 */
public class FindSolution {


    // This is the custom function interface.
    // You should not implement it, or speculate about its implementation
    class CustomFunction {
        // Returns f(x, y) for any given positive integers x and y.
        // Note that f(x, y) is increasing with respect to both x and y.
        // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
        public int f(int x, int y) {
            return x + y;
        }
    }


    class Solution {

        public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
            List<List<Integer>> result = new ArrayList<>();
            for (int i = 1; i <= z; i++) {
                int left = 1;
                int right = z + 1;
                while (left < right) {
                    int mid = left + (right - left) / 2;
                    int value = customfunction.f(i, mid);
                    if (value == z) {
                        List<Integer> numbers = new ArrayList<>();
                        numbers.add(i);
                        numbers.add(mid);
                        result.add(numbers);
                        break;
                    } else if (value < z) {
                        left = mid + 1;
                    } else {
                        right = mid;
                    }
                }
            }
            return result;
        }

    }

}
