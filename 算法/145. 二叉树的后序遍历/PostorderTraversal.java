import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostorderTraversal {


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

        List<Integer> result = new ArrayList<>();

        // 递归
        public List<Integer> postorderTraversal(TreeNode root) {
            if (root == null) {
                return result;
            }
            order(root);
            return result;
        }

        public void order(TreeNode node) {
            if (node == null) {
                return;
            }
            order(node.left);
            order(node.right);
            result.add(node.val);
        }

        // 迭代
        public List<Integer> postorderTraversal2(TreeNode root) {
            if (root == null) {
                return result;
            }
            // 前一个节点，用来标志其右叶子节点被处理后能直接出栈
            TreeNode pre = null;
            Stack<TreeNode> stack = new Stack<>();
            while (root != null || !stack.isEmpty()) {
                while (root != null) {
                    stack.push(root);
                    root = root.left;
                }
                root = stack.pop();
                if (root.right != null && root.right != pre) {
                    stack.push(root);
                    root = root.right;
                } else {
                    result.add(root.val);
                    pre = root;
                    root = null;
                }
            }
            return result;
        }

    }
}