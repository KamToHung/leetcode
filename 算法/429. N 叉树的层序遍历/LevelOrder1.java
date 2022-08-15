import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author kamtohung
 * @since 2022/8/15
 */
public class LevelOrder1 {

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

        public List<List<Integer>> levelOrder(Node root) {
            List<List<Integer>> result = new ArrayList<>();
            if (root == null) {
                return result;
            }
            LinkedList<Node> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> numbers = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    Node node = queue.pop();
                    numbers.add(node.val);
                    if (node.children != null && !node.children.isEmpty()) {
                        queue.addAll(node.children);
                    }
                }
                result.add(numbers);
            }
            return result;
        }

    }

}
