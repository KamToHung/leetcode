public class LowestCommonAncestor {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null) {
                return null;
            }
            // 找到p
            if (root.val == p.val) {
                return p;
            }
            // 找到q
            if (root.val == q.val) {
                return q;
            }
            // 之间返回root
            if (root.val > p.val && root.val < q.val) {
                return root;
            }
            if (root.val < p.val && root.val < q.val) {
                // 都大于root
                return lowestCommonAncestor(root.right, p, q);
            } else if (root.val > p.val && root.val > q.val) {
                // 都小于root
                return lowestCommonAncestor(root.left, p, q);
            }
            return root;
        }
    }

}
