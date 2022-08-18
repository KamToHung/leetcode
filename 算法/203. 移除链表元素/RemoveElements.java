
public class RemoveElements {

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

        public ListNode removeElements1(ListNode head, int val) {
            if (head == null) {
                return head;
            }
            ListNode node = new ListNode(-1);
            node.next = head;
            ListNode cur = node;
            while (cur.next != null) {
                if (cur.next.val == val) {
                    cur.next = cur.next.next;
                } else {
                    cur = cur.next;
                }
            }
            return node.next;
        }

        public ListNode removeElements(ListNode head, int val) {
            if (head == null) {
                return head;
            }
            head.next = removeElements(head.next, val);
            return head.val == val ? head.next : head;
        }

    }

}
