import java.util.HashMap;
import java.util.Map;

public class BuildTree {


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

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            if (preorder == null || inorder == null) {
                return null;
            }
            int num = preorder.length;
            // 记下每个数字在中序遍历数组中的位置
            Map<Integer, Integer> memo = new HashMap<>();
            for (int i = 0; i < num; i++) {
                memo.put(inorder[i], i);
            }
            return buildTree(preorder, inorder, memo, 0, num - 1, 0, num - 1);
        }

        public TreeNode buildTree(int[] preorder,
                                  int[] inorder,
                                  Map<Integer, Integer> memo,
                                  int preLeft,
                                  int preRight,
                                  int inLeft,
                                  int inRight) {
            // 终点，左边大于右边
            if (preLeft > preRight) {
                return null;
            }
            // 根节点位置
            int rootIndex = preLeft;
            // 根节点
            TreeNode root = new TreeNode(preorder[preLeft]);
            // 中序遍历中根节点位置
            Integer inRoot = memo.get(preorder[preLeft]);
            // 左子树节点数量
            int leftNum = inRoot - inLeft;
            // 递归构建左子树
            root.left = buildTree(preorder, inorder, memo, preLeft + 1, preLeft + leftNum, inLeft, inRoot - 1);
            // 递归构建右子树
            root.right = buildTree(preorder, inorder, memo, preLeft + 1 + leftNum, preRight, inRoot + 1, inRight);
            return root;
        }

    }

}
