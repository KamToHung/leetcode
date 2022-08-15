import java.util.LinkedList;

/**
 * @author kamtohung
 * @since 2022/8/15
 */
public class SumNumbers {


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

        public int sumNumbers(TreeNode root) {
            return bfs(root);
        }

        public int dfs(TreeNode node, int pre) {
            if (node == null) {
                return 0;
            }
            pre = pre * 10 + node.val;
            if (node.left == null && node.right == null) {
                return pre;
            }
            int leftSum = dfs(node.left, pre);
            int rightSum = dfs(node.right, pre);
            return leftSum + rightSum;
        }

        public int bfs(TreeNode node) {
            if (node == null) {
                return 0;
            }
            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.add(node);
            int sum = 0;
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode cur = queue.pop();
                    if (cur.left == null && cur.right == null) {
                        sum += cur.val;
                    }
                    if (cur.left != null) {
                        cur.left.val += cur.val * 10;
                        queue.addLast(cur.left);
                    }
                    if (cur.right != null) {
                        cur.right.val += cur.val * 10;
                        queue.addLast(cur.right);
                    }
                }
            }
            return sum;
        }

    }

}
