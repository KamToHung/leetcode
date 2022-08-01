public class Connect {

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
                return null;
            }
            connectNode(root);
            return root;
        }

        public void connect(Node left, Node right) {
            if (left == null || right == null) {
                return;
            }
            left.next = right;
            connect(left.left, left.right);
            connect(left.right, right.left);
            connect(right.left, right.right);
        }


        public void connectNode(Node node) {
            if (node.left == null || node.right == null) {
                return;
            }
            node.left.next = node.right;
            if (node.next != null) {
                node.right.next = node.next.left;
            }
            connectNode(node.left);
            connectNode(node.right);
        }

    }

}
