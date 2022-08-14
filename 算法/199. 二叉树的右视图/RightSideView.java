import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author kamtohung
 * @since 2022/8/14
 */
public class RightSideView {

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

        public List<Integer> rightSideView1(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            if (root == null) {
                return result;
            }
            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.pop();
                    if (i == size - 1) {
                        result.add(node.val);
                    }
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
            }
            return result;
        }

        public List<Integer> rightSideView(TreeNode root) {
            if (root == null) {
                return result;
            }
            dfs(root, 0);
            return result;
        }

        private List<Integer> result = new ArrayList<>();

        public void dfs(TreeNode node, int depth) {
            if (node == null) {
                return;
            }
            if (depth == result.size()) {
                result.add(node.val);
            }
            depth++;
            dfs(node.right, depth);
            dfs(node.left, depth);
        }

    }

}
