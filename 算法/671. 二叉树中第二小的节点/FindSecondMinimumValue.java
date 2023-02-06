import java.util.LinkedList;

/**
 * @author <a href = "kamtohung@gmail.com">KamTo Hung</a>
 */
public class FindSecondMinimumValue {


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
        public int findSecondMinimumValue(TreeNode root) {
            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.addLast(root);
            long result = Long.MAX_VALUE;
            while(!queue.isEmpty()) {
                int size = queue.size();
                for(int i = 0; i < size; i ++) {
                    TreeNode node = queue.removeFirst();
                    // 当前节点最小值为左右子节点的最小值，那么根节点就是最小值了，
                    // 第二小的值就是下一个和根节点不相等的值
                    if (node.val != root.val) {
                        result = Math.min(result, (long)node.val);
                    }
                    if (node.left != null) {
                        queue.addLast(node.left);
                    }
                    if (node.right != null) {
                        queue.addLast(node.right);
                    }
                }
            }
            return result == Long.MAX_VALUE ? -1 : (int)result;
        }

    }

}
