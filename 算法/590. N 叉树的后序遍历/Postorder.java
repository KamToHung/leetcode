import java.util.ArrayList;
import java.util.List;

public class Postorder {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    class Solution {

        public List<Integer> postorder(Node root) {
            List<Integer> result = new ArrayList<>();
            if (root == null) {
                return result;
            }
            postorder(root, result);
            return result;
        }

        public void postorder(Node node, List<Integer> result) {
            if (node == null) {
                return;
            }
            for (Node child : node.children) {
                postorder(child, result);
            }
            result.add(node.val);
        }

    }

}
