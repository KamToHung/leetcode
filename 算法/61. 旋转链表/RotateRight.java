
public class RotateRight {

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
        public ListNode rotateRight(ListNode head, int k) {
            // 构建循环的链，然后找出旋转的头节点，最后把旋转后的头节点的前一个节点的nxet设置为null即可
            // 若k>链的长度时候，取余即可
            if (head == null || head.next == null) {
                return head;
            }
            // 头节点
            ListNode tmp = head;
            // 计算链的长度
            int linkLen = 1;
            while (tmp.next != null) {
                linkLen++;
                tmp = tmp.next;
            }
            k %= linkLen;
            // 如果k为0代表不用旋转
            if (k == 0) {
                return head;
            }
            // 头尾连起来
            tmp.next = head;
            // 找出旋转后的最后一个节点
            for (int i = 0; i < linkLen - k; i++) {
                tmp = tmp.next;
            }
            ListNode result = tmp.next;
            tmp.next = null;
            return result;
        }
    }

}
