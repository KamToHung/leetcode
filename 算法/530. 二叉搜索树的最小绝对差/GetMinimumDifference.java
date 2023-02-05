import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author <a href = "kamtohung@gmail.com">KamTo Hung</a>
 */
public class GetMinimumDifference {


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

        // 迭代
        public int getMinimumDifference(TreeNode root) {
            // 前一个节点
            TreeNode pre = null;
            // 结果
            int result = Integer.MAX_VALUE;
            LinkedList<TreeNode> stack = new LinkedList<>();
            while (root != null || !stack.isEmpty()) {
                while (root != null) {
                    stack.push(root);
                    root = root.left;
                }
                root = stack.pop();
                if (pre != null) {
                    result = Math.min(result, root.val - pre.val);
                }
                pre = root;
                root = root.right;
            }
            return result;
        }

        private List<Integer> memo = new ArrayList<>();

        public int getMinimumDifference1(TreeNode root) {
            int result = Integer.MAX_VALUE;
            inOrder(root);
            for (int i = 1; i < memo.size(); i++) {
                result = Math.min(result, memo.get(i) - memo.get(i - 1));
            }
            return result;
        }

        // 中序遍历
        public void inOrder(TreeNode node) {
            if (node == null) {
                return;
            }
            inOrder(node.left);
            memo.add(node.val);
            inOrder(node.right);
        }
    }

}
