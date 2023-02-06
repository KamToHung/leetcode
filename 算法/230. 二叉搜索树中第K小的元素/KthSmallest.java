import java.util.LinkedList;

public class KthSmallest {


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

        public int kthSmallest(TreeNode root, int k) {
            LinkedList<TreeNode> queue = new LinkedList<>();
            while(root != null || !queue.isEmpty()) {
                while (root != null) {
                    queue.addLast(root);
                    root = root.left;
                }
                root = queue.removeLast();
                k--;
                if (k == 0) {
                    return root.val;
                }
                root = root.right;
            }
            return 0;
        }


        int k = 0;

        int result = 0;

        public int kthSmallest1(TreeNode root, int k) {
            this.k = k;
            dfs(root);
            return result;
        }

        private void dfs(TreeNode root) {
            if (root == null || k <= 0) {
                return;
            }
            dfs(root.left);
            // 得到结果
            k--;
            if (k == 0) {
                result = root.val;
            }
            dfs(root.right);
        }

    }

}
