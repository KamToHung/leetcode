
public class AddTwoNumbers {


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
        public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
            ListNode node = new ListNode();
            ListNode cur = node;
            int flag = 0;
            while (l1 != null || l2 != null) {
                int m = l1 == null ? 0 : l1.val;
                int n = l2 == null ? 0 : l2.val;
                int sum = m + n + flag;
                flag = sum / 10;
                int nowNum = sum % 10;
                cur.next = new ListNode(nowNum);
                cur = cur.next;
                if (l1 != null) {
                    l1 = l1.next;
                }
                if (l2 != null) {
                    l2 = l2.next;
                }
            }
            if (flag == 1) {
                cur.next = new ListNode(1);
            }
            return node.next;
        }

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode result = new ListNode();
            ListNode cur = result;
            int flag = 0;
            while (l1 != null || l2 != null) {
                int m = l1 == null ? 0 : l1.val;
                int n = l2 == null ? 0 : l2.val;
                int sum = m + n + flag;
                int curValue = sum % 10;
                flag = sum / 10;
                cur.next = new ListNode(curValue);
                cur = cur.next;
                if (l1 != null) {
                    l1 = l1.next;
                }
                if (l2 != null) {
                    l2 = l2.next;
                }
            }
            if (flag != 0) {
                cur.next = new ListNode(flag);
            }
            return result.next;
        }
    }

}
