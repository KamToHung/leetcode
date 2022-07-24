public class DiameterOfBinaryTree {


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

        int max = 0;

        public int diameterOfBinaryTree(TreeNode root) {
            if (root == null) {
                return max;
            }
            max(root);
            return max;
        }

        public int max(TreeNode node) {
            if (node == null) {
                return 0;
            }
            int left = max(node.left);
            int right = max(node.right);
            max = Math.max(max, left + right);
            return Math.max(left, right) + 1;
        }
    }

}
