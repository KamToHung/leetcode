import java.util.LinkedList;

/**
 * @author kamtohung
 * @since 2022/8/15
 */
public class Connect2 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    class Solution {

        public Node connect(Node root) {
            if (root == null) {
                return root;
            }
            LinkedList<Node> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                Node pre = null;
                for (int i = 0; i < size; i++) {
                    Node node = queue.pop();
                    if (pre != null) {
                        pre.next = node;
                    }
                    pre = node;
                    if (node.left != null) {
                        queue.addLast(node.left);
                    }
                    if (node.right != null) {
                        queue.addLast(node.right);
                    }
                }
            }
            return root;
        }

    }

}
