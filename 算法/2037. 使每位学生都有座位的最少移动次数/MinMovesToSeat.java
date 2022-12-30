import java.util.Arrays;

public class MinMovesToSeat {

    class Solution {
        public int minMovesToSeat(int[] seats, int[] students) {
            // 每位同学移动位置最近则最终移动次数最少，所以先排序然后取绝对值即可
            Arrays.sort(seats);
            Arrays.sort(students);
            int result = 0;
            for (int i = 0; i < seats.length; i++) {
                result += Math.abs(seats[i] - students[i]);
            }
            return result;
        }
    }

}
