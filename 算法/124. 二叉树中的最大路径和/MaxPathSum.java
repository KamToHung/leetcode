/**
 * @author kamtohung
 * @since 2022/8/14
 */
public class MaxPathSum {


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

        int max = Integer.MIN_VALUE;

        public int maxPathSum(TreeNode root) {
            max2(root);
            return max;
        }

        public int max(TreeNode node) {
            if (node == null) {
                return 0;
            }
            int left = Math.max(0, max(node.left));
            int right = Math.max(0, max(node.right));
            max = Math.max(max, left + right + node.val);
            return Math.max(left, right) + node.val;
        }

        public int max2(TreeNode node) {
            if (node == null) {
                return 0;
            }
            int left = max2(node.left);
            int right = max2(node.right);
            max = Math.max(max, left + right + node.val);
            // 当node作为非根节点的话，只能选择左节点或者右节点取最大值
            int nowMax = Math.max(left + node.val, right + node.val);
            // 如果小于0则取0
            return Math.max(nowMax, 0);
        }

    }

}
