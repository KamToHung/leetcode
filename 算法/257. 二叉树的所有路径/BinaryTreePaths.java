import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreePaths {


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

        List<String> result = new ArrayList<>();

        public List<String> binaryTreePaths(TreeNode root) {
            if (root == null) {
                return result;
            }
            LinkedList<String> numbers = new LinkedList<>();
            numbers.add(String.valueOf(root.val));
            dfs(root.left, root.right, numbers);
            return result;
        }

        public void dfs(TreeNode left, TreeNode right, LinkedList<String> nums) {
            // 叶子节点左右节点都为空
            if (left == null && right == null) {
                result.add(String.join("->", nums));
                return;
            }
            if (left != null) {
                nums.add(String.valueOf(left.val));
                dfs(left.left, left.right, nums);
                nums.removeLast();
            }
            if (right != null) {
                nums.add(String.valueOf(right.val));
                dfs(right.left, right.right, nums);
                nums.removeLast();
            }
        }

    }

}
