import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge {

    class Solution {

        public int[][] merge(int[][] intervals) {
            if (intervals == null || intervals.length <= 1) {
                return intervals;
            }
            List<int[]> result = new ArrayList<>();
            // 因为题目没有给出是有序的，我们首先进行排序
            Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
            // 先把第一个结果加进来
            result.add(intervals[0]);
            for (int i = 1; i < intervals.length; i++) {
                // 当前数组
                int[] cur = intervals[i];
                // 前一个数组
                int[] pre = result.get(result.size() - 1);
                // 如果当前数组的起始位置大于前一个数组的结束位置，说明没有重叠，直接加入结果集
                if (cur[0] > pre[1]) {
                    result.add(cur);
                } else {
                    // 否则，说明有重叠，我们需要更新前一个数组的结束位置
                    pre[1] = Math.max(pre[1], cur[1]);
                }
            }
            return result.toArray(new int[result.size()][]);
        }

    }

}
