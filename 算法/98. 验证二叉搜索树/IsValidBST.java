
public class IsValidBST {


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

        public boolean isValidBST(TreeNode root) {
//            return isValidBST2(root, Long.MIN_VALUE, Long.MAX_VALUE);
            isValidBST3(root);
            return flag;
        }

        private long pre = Long.MIN_VALUE;

        private boolean flag = true;

        public void isValidBST3(TreeNode node) {
            if (node == null) {
                return;
            }
            isValidBST3(node.left);
            int val = node.val;
            if (pre >= val) {
                flag = false;
                return;
            }
            pre = val;
            isValidBST3(node.right);
        }

        public boolean isValidBST1(TreeNode node) {
            if (node == null) {
                return true;
            }
            // 判断中序遍历是否升序
            boolean leftFlag = isValidBST1(node.left);
            if (!leftFlag) {
                return false;
            }
            // 如果当前节点小于中序遍历前一个节点，则返回false
            if (pre >= node.val) {
                return false;
            }
            pre = node.val;
            return isValidBST1(node.right);
        }

        public boolean isValidBST2(TreeNode node, long min, long max) {
            if (node == null) {
                return true;
            }
            if (node.val <= min || node.val >= max) {
                return false;
            }
            return isValidBST2(node.left, min, node.val) && isValidBST2(node.right, node.val, max);
        }

    }

}
