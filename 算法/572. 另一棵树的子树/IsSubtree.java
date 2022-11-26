
public class IsSubtree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            if(root == null && subRoot == null) {
                return true;
            }
            if(root == null && subRoot != null) {
                return false;
            }
            if(subRoot == null) {
                return true;
            }
            boolean flag = isSame(root, subRoot);
            if(flag) {
                return true;
            }
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }

        public boolean isSame(TreeNode p, TreeNode q) {
            if(p == null && q == null) {
                return true;
            }
            if(p == null || q == null) {
                return false;
            }
            if(p.val != q.val) {
                return false;
            }
            // 如果节点相等，则判断左节点和右节点是否相等
            return isSame(p.left, q.left) && isSame(p.right, q.right);
        }
    }

}
