import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderBottom {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {

        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            LinkedList<List<Integer>> result = new LinkedList<>();
            if (root == null) {
                return result;
            }
            // 队列，先进先出
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                // 每层节点数量
                int count = queue.size();
                // 保存的数字结果
                List<Integer> numbers = new ArrayList<>();
                for (int i = 0; i < count; i++) {
                    // 弹出一个节点
                    TreeNode node = queue.poll();
                    numbers.add(node.val);
                    if (node.left != null) {
                        // 左节点加入队列
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        // 右节点加入队列
                        queue.add(node.right);
                    }
                }
                // 每次都从链头加入，即可保证自底向上
                result.addFirst(numbers);
            }
            return result;
        }

    }

}
