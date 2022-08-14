/**
 * @author kamtohung
 * @since 2022/8/14
 */
public class CountNodes {

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

        public int countNodes(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int left = countNodes(root.left);
            int right = countNodes(root.right);
            return left + right + 1;
        }

    }

}
