import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {


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
        public List<Integer> inorderTraversal(TreeNode root) {
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
            result.add(node.val);
            order(node.right);
        }


        // 迭代
        public List<Integer> inorderTraversal2(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            if (root == null) {
                return result;
            }
            Stack<TreeNode> stack = new Stack<>();
            while (root != null || !stack.isEmpty()) {
                while (root != null) {
                    stack.push(root);
                    root = root.left;
                }
                root = stack.pop();
                result.add(root.val);
                root = root.right;
            }
            return result;
        }


    }

}
