public class RangeSumBST {


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
        public int rangeSumBST(TreeNode root, int low, int high) {
            // 如果找不到下一个节点，返回0
            if (root == null) {
                return 0;
            }
            // 如果值比最大值大，则取左节点
            if (root.val > high) {
                return rangeSumBST(root.left, low, high);
            }
            // 如果值比最小值小，则取右节点
            if (root.val < low) {
                return rangeSumBST(root.right, low, high);
            }
            return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        }
    }

}
