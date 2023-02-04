import java.util.LinkedList;
import java.util.Queue;

/**
 * @author <a href = "kamtohung@gmail.com">KamTo Hung</a>
 */
public class NearestExit {

    class Solution {

        public int nearestExit(char[][] maze, int[] entrance) {
            int m = maze.length;
            int n = maze[0].length;
            // 遍历方向
            int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
            // 访问过的位置标记
            int[][] visited = new int[m][n];
            // 步数
            int result = 0;
            Queue<int[]> queue = new LinkedList<>();
            // 确定BFS源点，加入队列
            queue.offer(entrance);
            // 标记入口
            visited[entrance[0]][entrance[1]] = 1;
            while (!queue.isEmpty()) {
                // 步数+1
                result++;
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    int[] current = queue.poll();
                    if (current == null) {
                        break;
                    }
                    // 每个点都要遍历方向
                    for (int[] direction : directions) {
                        int x = current[0] + direction[0];
                        int y = current[1] + direction[1];
                        if (x < 0 || x >= m || y < 0 || y >= n || maze[x][y] == '+' || visited[x][y] == 1) {
                            continue;
                        }
                        if (x == 0 || x == m - 1 || y == 0 || y == n - 1) {
                            return result;
                        }
                        visited[x][y] = 1;
                        queue.offer(new int[]{x, y});
                    }
                }
            }
            return -1;
        }
    }

}
