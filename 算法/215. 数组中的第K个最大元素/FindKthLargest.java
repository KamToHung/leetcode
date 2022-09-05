import java.util.PriorityQueue;
import java.util.Queue;

public class FindKthLargest {

    class Solution {

        public int findKthLargest(int[] nums, int k) {
            Queue<Integer> queue = new PriorityQueue<>();
            for (int num : nums) {
                queue.offer(num);
                if (queue.size() > k) {
                    queue.poll();
                }
            }
            return queue.poll();
        }

    }

}
