import java.util.ArrayList;
import java.util.List;

public class Flatten {


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

        public void flatten(TreeNode root) {
            // 与数组不同的痛点是，链表需要维护尾节点
            // 首先使用前序遍历转成数组,然后再转成链表
            if (root == null) {
                return;
            }
            List<TreeNode> result = new ArrayList<>();
            order(root, result);
            // 转链表
            for (int i = 1; i < result.size(); i++) {
                TreeNode pre = result.get(i - 1);
                TreeNode cur = result.get(i);
                pre.left = null;
                pre.right = cur;
            }        }

        private void order(TreeNode node, List<TreeNode> result) {
            if (node == null) {
                return;
            }
            result.add(node);
            order(node.left, result);
            order(node.right, result);
        }
    }

}
