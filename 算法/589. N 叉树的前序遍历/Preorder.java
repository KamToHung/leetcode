import java.util.ArrayList;
import java.util.List;

public class Preorder {

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

        public List<Integer> preorder(Node root) {
            List<Integer> result = new ArrayList<>();
            if (root == null) {
                return result;
            }
            preorder(root, result);
            return result;
        }

        public void preorder(Node node, List<Integer> result) {
            if (node == null) {
                return;
            }
            result.add(node.val);
            for (Node child : node.children) {
                preorder(child, result);
            }
        }

    }

}
