import java.util.LinkedList;
import java.util.Queue;

/**
 * <a href="https://leetcode.cn/problems/shortest-bridge/solution/-by-muse-77-j7w5/">详解</a>
 */
public class ShortestBridge {

    class Solution {
        int[] directions = new int[]{-1, 0, 1, 0, -1};
        int n;
        Queue<int[]> edges; //存储边缘格子
        public int shortestBridge(int[][] grid) {
            n = grid.length;
            edges = new LinkedList<>();
            boolean findInsland = false; // 只要找到2个岛屿中其中的1个岛屿，就将其设置为true，并结束步骤1中的两层for循环

            /** 步骤1：为其中一个岛屿打标记（val=2），并保存”边界格子“到edges中 */
            for (int i = 0; !findInsland && i < n; i++) {
                for (int j = 0; !findInsland && j < n; j++) {
                    if (grid[i][j] == 1) {
                        markInsland(grid, i, j);
                        findInsland = true;
                    }
                }
            }

            /** 步骤2：利用边界edges，一层一层扩展岛屿（val=2），直到遇到另一个岛屿（val=1）*/
            int step = 1;
            while (!edges.isEmpty()) {
                int sz = edges.size();
                for (int i = 0; i < sz; i++) {
                    int[] cur = edges.poll();
                    for (int j = 0; j < directions.length - 1; j++) {
                        int x = cur[0] + directions[j];
                        int y = cur[1] + directions[j + 1];
                        if (x >= n || x < 0 || y >= n|| y < 0 || grid[x][y] == 2) continue;
                        if (grid[x][y] == 0) {
                            grid[x][y] = 2;
                            edges.offer(new int[]{x, y});
                        } else if (grid[x][y] == 1) return step;
                    }
                }
                step++;
            }
            return step;
        }

        /** 标记一个岛屿的同时，记录边缘格子 */
        public void markInsland(int[][] grid, int i, int j) {
            Queue<int[]> q = new LinkedList<>();
            q.offer(new int[]{i, j});
            grid[i][j] = 2;

            while (!q.isEmpty()) {
                int[] cur = q.poll();
                for (int k = 0; k < directions.length - 1; k++) {
                    int x = cur[0] + directions[k];
                    int y = cur[1] + directions[k + 1];
                    if (x >= n || x < 0 || y >= n || y < 0 || grid[x][y] == 2) continue;
                    if (grid[x][y] == 1) {
                        grid[x][y] = 2;
                        q.offer(new int[]{x, y});
                    } else if (grid[x][y] == 0) {
                        grid[x][y] = 2;
                        edges.offer(new int[]{x, y});
                    }
                }
            }
        }
    }
}
