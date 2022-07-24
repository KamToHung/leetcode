import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {

        List<Integer> result = new ArrayList<>();

        public List<Integer> preorderTraversal2(TreeNode root) {
            if (root == null) {
                return result;
            }
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                TreeNode node = stack.pop();
                result.add(node.val);
                if (node.right != null) {
                    stack.push(node.right);
                }
                if (node.left != null) {
                    stack.push(node.left);
                }
            }
            return result;
        }

    }

}
