import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {

    class Solution {

        // 经典top key问题
        public int[] topKFrequent(int[] nums, int k) {
            if (nums == null || nums.length == 0 || k <= 0) {
                return new int[0];
            }
            // 结果集
            int[] result = new int[k];
            // 先统计
            Map<Integer, Integer> memo = new HashMap<>();
            for (int num : nums) {
                memo.put(num, memo.getOrDefault(num, 0) + 1);
            }
            // 小顶堆，使用优先队列
            PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(((o1, o2) -> o1[1] - o2[1]));
            // 遍历统计结果
            memo.forEach((num, count) -> {
                // 如果堆中元素个数小于k，直接入堆
                if (priorityQueue.size() < k) {
                    priorityQueue.offer(new int[]{num, count});
                } else {
                    // 如果堆中元素个数等于k，且当前元素的出现次数大于堆顶元素的出现次数，弹出堆顶元素，将当前元素入堆
                    if (count > priorityQueue.peek()[1]) {
                        priorityQueue.poll();
                        priorityQueue.offer(new int[]{num, count});
                    }
                }
            });
            for (int i = 0; i < k; i++) {
                int[] value = priorityQueue.poll();
                if (value != null && value.length > 0) {
                    result[i] = value[0];
                }
            }
            return result;
        }

    }

}
