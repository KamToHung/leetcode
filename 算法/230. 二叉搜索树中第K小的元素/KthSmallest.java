import java.util.ArrayList;
import java.util.List;

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

        private List<Integer> result = new ArrayList<>();

        public int kthSmallest(TreeNode root, int k) {
            if (root == null) {
                return 0;
            }
            order(root);
            return result.get(k - 1);
        }

        // 中序遍历可以从小到大排序
        public void order(TreeNode node) {
            if (node == null) {
                return;
            }
            order(node.left);
            result.add(node.val);
            order(node.right);
        }

        int number;

        int n = 0;

        public int kthSmallest2(TreeNode root, int k) {
            if (root == null) {
                return 0;
            }
            order2(root, k);
            return number;
        }

        // 进阶：如果二叉搜索树经常被修改（插入/删除操作）并且你需要频繁地查找第 k 小的值，你将如何优化算法？
        public void order2(TreeNode node, int k) {
            if (node == null) {
                return;
            }
            order2(node.left, k);
            if (++n == k) {
                number = node.val;
                return;
            }
            order2(node.right, k);
        }

    }

}
