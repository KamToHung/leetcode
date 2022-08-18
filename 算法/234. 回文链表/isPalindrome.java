import java.util.List;

public class isPalindrome {

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

        public boolean isPalindrome(ListNode head) {
            if (head == null || head.next == null) {
                return true;
            }
            ListNode slow = head;
            ListNode fast = head;
            // 找出中点
            while (fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            // 倒序
            ListNode reserveNode = reserve(slow.next);
            while (reserveNode != null) {
                if (reserveNode.val != head.val) {
                    return false;
                }
                reserveNode = reserveNode.next;
                head = head.next;
            }
            return true;
        }

        public ListNode reserve(ListNode node) {
            ListNode pre = null;
            ListNode cur = node;
            ListNode next = null;
            while (cur != null) {
                next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }
            return pre;
        }

    }

}
