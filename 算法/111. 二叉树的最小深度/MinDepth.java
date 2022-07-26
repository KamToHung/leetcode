public class MinDepth {

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

        public int minDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int left = minDepth(root.left);
            int right = minDepth(root.right);
            // 有种特殊情况，例如当左节点为空时，返回为0，但是最小深度不应该用左节点来计算，需要用右节点
            if (left == 0) {
                return right + 1;
            } else if (right == 0) {
                return left + 1;
            }
            return Math.min(left, right) + 1;
        }

    }

}
