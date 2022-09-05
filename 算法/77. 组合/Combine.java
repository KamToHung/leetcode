import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combine {

    class Solution {

        List<List<Integer>> result = new ArrayList<>();

        public List<List<Integer>> combine(int n, int k) {
            helper(n, k, 1, new LinkedList<>());
            return result;
        }

        public void helper(int n, int k, int start, LinkedList<Integer> numbers) {
            if (numbers.size() == k) {
                result.add(new ArrayList<>(numbers));
                return;
            }
            for (int i = start; i <= n; i++) {
                numbers.add(i);
                helper(n, k, i + 1, numbers);
                numbers.removeLast();
            }
        }

    }

}
