public class LeafSimilar {


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

        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            StringBuilder builder1 = new StringBuilder();
            StringBuilder builder2 = new StringBuilder();
            toStr(root1, builder1);
            toStr(root2, builder2);
            return builder1.toString().equals(builder2.toString());
        }

        public void toStr(TreeNode node, StringBuilder builder) {
            if (node == null) {
                return;
            }
            if (node.left == null && node.right == null) {
                builder.append(node.val).append("|");
            }
            toStr(node.left, builder);
            toStr(node.right, builder);
        }

    }

}
