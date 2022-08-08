import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/unique-binary-search-trees-ii/solution/cong-gou-jian-dan-ke-shu-dao-gou-jian-suo-you-shu-/">...</a>
 */
public class GenerateTrees {

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

        public List<TreeNode> generateTrees(int n) {
            return helper(1, n);
        }

        public List<TreeNode> helper(int start, int end) {
            List<TreeNode> result = new ArrayList<>();
            if (start > end) {
                result.add(null);
                return result;
            }
            // 构造树
            // 拿到某个节点作为根节点
            for (int i = start; i <= end; i++) {
                // 由96可知，左右节点笛卡尔积为不同树的数量，所以这里这么处理
                List<TreeNode> left = helper(start, i - 1);
                List<TreeNode> right = helper(i + 1, end);
                for (TreeNode leftNode : left) {
                    for (TreeNode rightNode : right) {
                        TreeNode node = new TreeNode(i);
                        node.left = leftNode;
                        node.right = rightNode;
                        result.add(node);
                    }
                }
            }
            return result;
        }

    }

}
