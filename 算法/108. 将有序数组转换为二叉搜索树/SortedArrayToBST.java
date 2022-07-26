public class SortedArrayToBST {

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

        public TreeNode sortedArrayToBST(int[] nums) {
            // 因为是有序数组，所以中点即可作为节点
            if (nums == null) {
                return null;
            }
            return order(nums, 0, nums.length - 1);
        }

        public TreeNode order(int[] nums, int left, int right) {
            // BST树以排序数组中点为root开始遍历
            if (left > right) {
                return null;
            }
            int mid = left + (right - left) / 2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = order(nums, left, mid - 1);
            node.right = order(nums, mid + 1, right);
            return node;
        }

    }

}
