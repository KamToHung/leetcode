
public class ReverseList {


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

        public ListNode reverseList1(ListNode head) {
            ListNode pre = null;
            ListNode cur = head;
            ListNode next = null;
            while (cur != null) {
                next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }
            return pre;
        }

        // 递归
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            // 找到倒数第二个节点
            ListNode node = reverseList(head.next);
            // 第二个节点的下一个节点为前一个节点
            head.next.next = head;
            // head为为尾节点，指向null
            head.next = null;
            return node;
        }

    }

}
