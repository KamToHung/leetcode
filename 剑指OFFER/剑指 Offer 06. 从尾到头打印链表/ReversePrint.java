/**
 * @author kamtohung
 * @since 2022/10/5
 */
public class ReversePrint {


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public int[] reversePrint(ListNode head) {
            ListNode cur = head;
            ListNode next = null;
            ListNode pre = null;
            int i = 0;
            while (cur != null) {
                next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
                i++;
            }
            int[] result = new int[i];
            for (int j = 0; j < result.length; j++) {
                result[j] = pre.val;
                pre = pre.next;
            }
            return result;
        }
    }

}
