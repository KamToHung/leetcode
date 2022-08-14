import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author kamtohung
 * @since 2022/8/15
 */
public class PathSum {

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

        private List<List<Integer>> result = new ArrayList<>();

        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            if (root == null) {
                return result;
            }
            dfs(root, targetSum, 0, new LinkedList<>());
            return result;
        }

        private void dfs(TreeNode node, int targetSum, int sum, LinkedList<Integer> curList) {
            if (node == null) {
                return;
            }
            // 如果左右节点都为空则代表是叶子节点，并且等于targetSum的话就是一个结果
            if (node.left == null && node.right == null && node.val + sum == targetSum) {
                curList.addLast(node.val);
                result.add(new ArrayList<>(curList));
                curList.removeLast();
                return;
            }
            curList.addLast(node.val);
            dfs(node.left, targetSum, sum + node.val, curList);
            dfs(node.right, targetSum, sum + node.val, curList);
            curList.removeLast();
        }
    }

}
