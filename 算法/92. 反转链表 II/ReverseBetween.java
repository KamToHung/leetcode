import java.util.List;

public class ReverseBetween {

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

        public ListNode reverseBetween(ListNode head, int left, int right) {
            if (left == 1) {
                return reverseN(head, right);
            }
            ListNode node = reverseBetween(head.next, left - 1, right - 1);
            head.next = node;
            return head;
        }

        ListNode tail = null;

        public ListNode reverseN(ListNode head, int n) {
            if (n == 1) {
                tail = head.next;
                return head;
            }
            ListNode node = reverseN(head.next, n - 1);
            head.next.next = head;
            head.next = tail;
            return node;
        }


        public ListNode reverseBetween1(ListNode head, int left, int right) {
            if (head == null || head.next == null) {
                return head;
            }
            // 新链表节点
            ListNode node = new ListNode(-1);
            node.next = head;
            // 前
            ListNode leftNode = node;
            // 需要反转的头节点的前一个节点
            ListNode preLeftNode = null;
            // 后
            ListNode rightNode = node;
            // 需要反转的尾节点的后一个节点
            ListNode tailRightNode = null;
            for (int i = 0; i < left; i++) {
                if (i == left - 1) {
                    preLeftNode = leftNode;
                }
                leftNode = leftNode.next;
            }
            for (int i = 0; i < right; i++) {
                rightNode = rightNode.next;
            }
            tailRightNode = rightNode.next;
            ListNode reverseNode = reverse(leftNode, tailRightNode);
            preLeftNode.next = reverseNode;
            leftNode.next = tailRightNode;
            return node.next;
        }

        private ListNode reverse(ListNode leftNode, ListNode rightNode) {
            ListNode pre = null;
            ListNode cur = leftNode;
            ListNode next = null;
            while (cur != rightNode) {
                next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }
            return pre;
        }

    }

}
