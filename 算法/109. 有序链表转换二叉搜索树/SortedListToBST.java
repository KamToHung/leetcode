public class SortedListToBST {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

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

        public TreeNode sortedListToBST(ListNode head) {
            if (head == null) {
                return null;
            }
            return sort(head, null);
        }

        public TreeNode sort(ListNode head, ListNode tail) {
            if (head == tail) {
                return null;
            }
            // 找出中点
            ListNode slow = head;
            ListNode fast = head;
            while (fast != tail && fast.next != tail) {
                slow = slow.next;
                fast = fast.next.next;
            }
            TreeNode node = new TreeNode(slow.val);
            node.left = sort(head, slow);
            node.right = sort(slow.next, tail);
            return node;
        }

    }

}
