public class LowestCommonAncestor2 {


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
                return root;
            }
            // 如果找到了p则返回
            if (root.val == p.val) {
                return p;
            }
            // 如果找到了q则返回
            if (root.val == q.val) {
                return q;
            }
            // 查询左边是否含有p或q
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            // 查询右边是否含有p或q
            TreeNode right = lowestCommonAncestor(root.right, p, q);
            // 如果左右都含有pq，则root为最近公共祖先
            if (left != null && right != null) {
                return root;
            }
            // 如果pq都存在root左边，则左边查询到的第一个节点为最近公共祖先
            if (left != null && right == null) {
                return left;
            }
            // 如果pq都存在root右边，则右边查询到的第一个节点为最近公共祖先
            if (left == null && right != null) {
                return right;
            }
            return null;
        }

    }

}
