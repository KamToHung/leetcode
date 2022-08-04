import java.util.HashMap;
import java.util.Map;

public class BuildTree2 {


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

        public TreeNode buildTree(int[] inorder, int[] postorder) {
            if (postorder == null || inorder == null) {
                return null;
            }
            int num = postorder.length;
            // 记下每个数字在中序遍历数组中的位置
            Map<Integer, Integer> memo = new HashMap<>();
            for (int i = 0; i < num; i++) {
                memo.put(inorder[i], i);
            }
            return buildTree(postorder, inorder, memo, 0, num - 1, 0, num - 1);
        }

        public TreeNode buildTree(int[] postorder,
                                  int[] inorder,
                                  Map<Integer, Integer> memo,
                                  int postLeft,
                                  int postRight,
                                  int inLeft,
                                  int inRight) {
            // 终点，左边大于右边
            if (postLeft > postRight) {
                return null;
            }
            // 根节点位置
            int rootIndex = postRight;
            // 根节点
            TreeNode root = new TreeNode(postorder[rootIndex]);
            // 中序遍历中根节点位置
            Integer inRoot = memo.get(postorder[rootIndex]);
            // 右子树节点数量
            int rightNum = inRight - inRoot;
            // 递归构建左子树
            root.left = buildTree(postorder, inorder, memo, postLeft, postRight - rightNum - 1, inLeft, inRoot - 1);
            // 递归构建右子树
            root.right = buildTree(postorder, inorder, memo, postRight - rightNum, postRight - 1, inRoot + 1, inRight);
            return root;
        }

    }

}
