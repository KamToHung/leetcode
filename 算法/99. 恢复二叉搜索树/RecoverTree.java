
public class RecoverTree {


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

        public void recoverTree(TreeNode root) {
            if (root == null) {
                return;
            }
            order(root);
            int temp = errorNode1.val;
            errorNode1.val = errorNode2.val;
            errorNode2.val = temp;
        }

        private TreeNode pre = new TreeNode(Integer.MIN_VALUE);

        private TreeNode errorNode1 = null;

        private TreeNode errorNode2 = null;

        public void order(TreeNode node) {
            if (node == null) {
                return;
            }
            order(node.left);
            // 因为是BST树，所以中序遍历是升序的，则找出不是升序那个点即可
            if (pre.val > node.val) {
                // 首先找出第一个错误节点，位置在第一次出现中序排序不是升序，取pre节点
                if (errorNode1 == null) {
                    errorNode1 = pre;
                }
                // 第二找出第二个错误节点，位置在第二次出现中序排序不是升序，取后一个节点
                if (errorNode1 != null) {
                    errorNode2 = node;
                }
            }
            pre = node;
            order(node.right);
        }

    }

}
