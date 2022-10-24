
public class ReverseKGroup {


    public static class ListNode {
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

        public ListNode reverseKGroup(ListNode head, int k) {
            if (head == null) {
                return null;
            }
            ListNode left = head;
            ListNode right = head;
            for (int i = 0; i < k; i++) {
                if (right == null) {
                    return head;
                }
                right = right.next;
            }
            ListNode listNode = reverse(left, right);
            left.next = reverseKGroup(right, k);
            return listNode;
        }

        public ListNode reverse(ListNode left, ListNode right) {
            ListNode pre = null;
            ListNode cur = left;
            ListNode next = null;
            while (cur != right) {
                next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }
            return pre;
        }


        public ListNode reverseKGroup1(ListNode head, int k) {
            if (head == null) {
                return null;
            }
            ListNode node = head;
            int number = 0;
            while (node != null) {
                node = node.next;
                number++;
            }
            // 按k个一组翻转
            int m = 1;
            int n = k;
            ListNode cur = head;
            do {
                cur = reverse(cur, m, n);
                m = m + k;
                n = n + k;
            } while (n <= number);
            return cur;
        }

        // 翻转m~n的节点
        public ListNode reverse(ListNode node, int m, int n) {
            if (m == 1) {
                // 先通过递归到需要反转的头节点，此时头节点+n是需要翻转的链表部分
                return reverse(node, n);
            }
            // 递归到m=1的时候，只需要next指向翻转部分的链表
            node.next = reverse(node.next, m - 1, n - 1);
            return node;
        }

        ListNode tail = null;

        // 翻转前n个节点
        public ListNode reverse(ListNode node, int n) {
            if (n == 1) {
                // 保存最后一个节点的下一个节点
                tail = node.next;
                return node;
            }
            // 递归到最后一个节点
            ListNode listNode = reverse(node.next, n - 1);
            // 当前节点的下一个节点的下一个节点为当前节点，进行翻转
            node.next.next = node;
            // 当前节点下一个节点是非反转节点的第一个节点
            node.next = tail;
            return listNode;
        }

        ListNode tailNode = null;

        ListNode reverseN(ListNode head, int n) {
            if (n == 1) {
                tailNode = head.next;
                return head;
            }
            ListNode node = reverseN(head.next, n - 1);
            head.next.next = head;
            head.next = tailNode;
            return node;
        }

        ListNode reverseBetween(ListNode head, int m, int n) {
            if (m == 1) {
                return reverseN(head, n);
            }
            ListNode node = reverseBetween(head, m - 1, n - 1);
            // next其实就是从m开始后的链表
            head.next = node;
            return head;
        }


    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
//        ListNode listNode = Solution.reverseKGroup(node1, 2);
//        System.out.println(listNode);
    }

}
