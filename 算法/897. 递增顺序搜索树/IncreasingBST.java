public class IncreasingBST {


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

        TreeNode result = new TreeNode();

        public TreeNode increasingBST(TreeNode root) {
            if (root == null) {
                return null;
            }
            TreeNode cur = result;
            order(root);
            return cur.right;
        }

        public void order(TreeNode node) {
            if (node == null) {
                return;
            }
            order(node.left);
            node.left = null;
            result.right = node;
            result = result.right;
            order(node.right);
        }

    }

}
