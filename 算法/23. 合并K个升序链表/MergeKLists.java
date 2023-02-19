import java.util.PriorityQueue;

public class MergeKLists {


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
        public ListNode mergeKLists(ListNode[] lists) {
            if (lists == null || lists.length < 1) {
                return null;
            }
            if (lists.length < 2) {
                return lists[0];
            }
            ListNode result = lists[0];
            for (int i = 1; i < lists.length; i++) {
                result = mergeTwo(result, lists[i]);
            }
            return result;
        }

        public ListNode mergeTwo(ListNode list1, ListNode list2) {
            ListNode node = new ListNode(-1);
            ListNode p = node;
            while (list1 != null && list2 != null) {
                if (list1.val > list2.val) {
                    p.next = list2;
                    list2 = list2.next;
                } else {
                    p.next = list1;
                    list1 = list1.next;
                }
                p = p.next;
            }
            if (list1 != null) {
                p.next = list1;
            }
            if (list2 != null) {
                p.next = list2;
            }
            return node.next;
        }


        // 优先队列
        public ListNode mergeKLists1(ListNode[] lists) {
            if (lists == null || lists.length == 0) {
                return null;
            }
            // 虚拟头结点
            ListNode result = new ListNode();
            ListNode node = result;
            // 优先队列
            PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b) -> a.val - b.val);
            // 先把结点加入优先队列
            for (ListNode cur : lists) {
                if (cur != null) {
                    queue.add(cur);
                }
            }
            while (!queue.isEmpty()) {
                // 获取最小结点，放入结果集中
                ListNode cur = queue.poll();
                node.next = cur;
                if (cur.next != null) {
                    queue.offer(cur.next);
                }
                node = node.next;
            }
            return result.next;
        }


    }

}
