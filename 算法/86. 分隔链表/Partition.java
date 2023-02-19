
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
            ListNode small = new ListNode(-1);
            ListNode big = new ListNode(-1);
            ListNode smallHead = small;
            ListNode bigHead = big;
            ListNode node = head;
            while (node != null) {
                if (node.val < x) {
                    small.next = node;
                    small = small.next;
                } else {
                    big.next = node;
                    big = big.next;
                }
                node = node.next;
            }
            big.next = null;
            small.next = bigHead.next;
            return smallHead.next;
        }

    }

}