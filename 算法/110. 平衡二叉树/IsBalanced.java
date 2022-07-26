public class IsBalanced {


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

        boolean flag = true;

        public boolean isBalanced(TreeNode root) {
            maxDepth(root);
            return flag;
        }

        public int maxDepth(TreeNode node) {
            if (node == null) {
                return 0;
            }
            int left = maxDepth(node.left);
            int right = maxDepth(node.right);
            if (Math.abs(left - right) > 1) {
                flag = false;
                // 直接返回，不用在意返回什么
                return 0;
            }
            return Math.max(left, right) + 1;
        }

    }

}
