
public class Partition {

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

    class Solution {

        public ListNode partition(ListNode head, int x) {
            ListNode left = new ListNode(-1);
            ListNode right = new ListNode(-1);
            ListNode leftNode = left;
            ListNode rightNode = right;
            while (head != null) {
                if (head.val < x) {
                    leftNode.next = head;
                    leftNode = leftNode.next;
                } else {
                    rightNode.next = head;
                    rightNode = rightNode.next;
                }
                head = head.next;
            }
            rightNode.next = null;
            leftNode.next = right.next;
            return left.next;
        }

    }

}
