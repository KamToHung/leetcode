import java.util.List;

public class SortList {


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

        public ListNode sortList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            // 归并排序
            ListNode midNode = mid(head);
            ListNode rightNode = midNode.next;
            midNode.next = null;
            ListNode left = sortList(head);
            ListNode right = sortList(rightNode);
            return mergeTwo(left, right);
        }

        public ListNode mergeTwo(ListNode node1, ListNode node2) {
            ListNode node = new ListNode(-1);
            ListNode cur = node;
            while (node1 != null && node2 != null) {
                if (node1.val < node2.val) {
                    cur.next = node1;
                    node1 = node1.next;
                } else {
                    cur.next = node2;
                    node2 = node2.next;
                }
                cur = cur.next;
            }
            if (node1 != null) {
                cur.next = node1;
            }
            if (node2 != null) {
                cur.next = node2;
            }
            return node.next;
        }

        public ListNode mid(ListNode node) {
            if (node == null || node.next == null) {
                return node;
            }
            ListNode fast = node.next.next;
            ListNode slow = node;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }

    }

}
