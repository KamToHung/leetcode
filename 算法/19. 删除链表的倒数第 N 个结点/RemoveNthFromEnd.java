
public class RemoveNthFromEnd {

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

        //快慢指针
        public ListNode removeNthFromEnd1(ListNode head, int n) {
            if (head == null) {
                return head;
            }
            ListNode fast = head;
            ListNode slow = head;
            for (int i = 0; i < n; i++) {
                fast = fast.next;
            }
            // 需要删除第一个节点
            if (fast == null) {
                return head.next;
            }
            while (fast != null && fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;
            return head;
        }

        int pos = 0;

        // 递归
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode node = removeNthFromEnd(head.next, n);
            head.next = node;
            pos++;
            return pos == n ? head.next : head;
        }

    }

}
