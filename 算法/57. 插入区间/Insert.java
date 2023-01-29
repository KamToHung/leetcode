import java.util.ArrayList;
import java.util.List;

public class Insert {

    class Solution {

        public int[][] insert(int[][] intervals, int[] newInterval) {
            // 需要插入的数据的左右数字
            int left = newInterval[0];
            int right = newInterval[1];
            // 结果集
            List<int[]> result = new ArrayList<>();
            // 标记已插入
            boolean flag = false;
            for (int[] interval : intervals) {
                int intervalLeft = interval[0];
                int intervalRight = interval[1];
                if (intervalRight < left) {
                    // 如果当前区间的右边界小于插入区间的左边界，说明没有重叠，直接加入结果集
                    result.add(interval);
                } else if (intervalLeft > right) {
                    // 如果当前区间的左边界大于插入区间的右边界，说明没有重叠，直接加入结果集
                    // 把插入区间加入结果集
                    if (!flag) {
                        result.add(new int[]{left, right});
                        flag = true;
                    }
                    // 把当前区间加入结果集
                    result.add(interval);
                } else {
                    // 如果在区间中间，需要合并
                    // 如果当前区间的左边界小于插入区间的左边界，说明插入区间的左边界需要更新
                    left = Math.min(left, intervalLeft);
                    // 如果当前区间的右边界大于插入区间的右边界，说明插入区间的右边界需要更新
                    right = Math.max(right, intervalRight);
                }
            }
            // 如果没有插入，说明插入区间在最后
            if (!flag) {
                result.add(new int[]{left, right});
            }
            return result.toArray(new int[result.size()][]);
        }

    }

}
