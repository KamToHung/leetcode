class OddEvenList {

    class Solution {

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

        public ListNode oddEvenList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            // 奇链表头结点
            ListNode firstHead = head;
            // 奇链表尾节点
            ListNode firstTail = head;
            // 偶链表头结点
            ListNode lastHead = head.next;
            // 偶链表尾节点
            ListNode lastTail = lastHead;
            while (firstTail.next != null && lastTail.next != null) {
                firstTail.next = lastTail.next;
                firstTail = firstTail.next;
                lastTail.next = firstTail.next;
                lastTail = lastTail.next;
            }
            firstTail.next = lastHead;
            return head;
        }
    }

}