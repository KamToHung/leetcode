
/**
 *
 * @author <a href = "kamtohung@gmail.com">KamTo Hung</a>
 */
public class MergeInBetween {


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

        public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
            ListNode preA = list1;
            // 找到a的前一个节点
            for (int i = 0; i < a - 1; i++) {
                preA = preA.next;
            }
            ListNode preB = preA;
            // 找到b的前一个节点
            for (int i = 0; i < b - a + 2; i++) {
                preB = preB.next;
            }
            // 拼接，此时删除了a~b的节点
            preA.next = list2;
            // 找到list2的最后一个节点
            while (list2.next != null) {
                list2 = list2.next;
            }
            // 拼接list1删除a~b后面的节点
            list2.next = preB;
            return list1;
        }

    }

}
