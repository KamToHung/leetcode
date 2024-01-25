import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class NextGreaterElement {

    class Solution {

        // 单调栈
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            LinkedList<Integer> stack = new LinkedList<>();
            Map<Integer, Integer> memo = new HashMap<>();
            for (int i : nums2) {
                // 单调栈，如果找出元素使大于栈顶元素，则加入memo中
                while (!stack.isEmpty() && stack.peekLast() < i) {
                    memo.put(stack.pollLast(), i);
                }
                stack.addLast(i);
            }
            int[] result = new int[nums1.length];
            for (int i = 0; i < nums1.length; i++) {
                result[i] = memo.getOrDefault(nums1[i], -1);
            }
            return result;
        }

        public int[] nextGreaterElement1(int[] nums1, int[] nums2) {
            Map<Integer, Integer> memo = new HashMap<>();
            for (int i = 0; i < nums2.length; i++) {
                memo.put(nums2[i], i);
            }
            int[] result = new int[nums1.length];
            for (int i = 0; i < nums1.length; i++) {
                int value = -1;
                if (memo.containsKey(nums1[i])) {
                    // 循环的元素在nums2里的index
                    int index = memo.get(nums1[i]);
                    for (int j = index + 1; j < nums2.length; j++) {
                        // 下一个更大的元素
                        if (nums2[j] > nums1[i]) {
                            value = nums2[j];
                            break;
                        }
                    }
                }
                result[i] = value;
            }
            return result;
        }

    }

}
