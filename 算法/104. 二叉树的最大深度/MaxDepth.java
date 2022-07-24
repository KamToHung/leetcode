public class MaxDepth {


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

        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int leftLen = 0;
            int rightLen = 0;
            if (root.left != null) {
                leftLen = maxDepth(root.left);
            }
            if (root.right != null) {
                rightLen = maxDepth(root.right);
            }
            return Math.max(leftLen, rightLen) + 1;
        }


    }

}
