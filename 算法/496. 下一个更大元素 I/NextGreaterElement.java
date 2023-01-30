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
            int m = nums1.length;
            int n = nums2.length;
            int[] result = new int[m];
            // 遍历nums1
            for (int i = 0; i < m; i++) {
                int value = nums1[i];
                // 遍历nums2
                // 首先找到相等的数的位置，然后从这个位置开始遍历，如果找到比这个数大的数，就是结果
                for (int j = 0; j < n; j++) {
                    if (nums2[j] == value) {
                        for (int k = j; k < n; k++) {
                            // 如果找到比这个数大的数，就是结果
                            if (nums2[k] > value) {
                                result[i] = nums2[k];
                                break;
                            }
                            // 如果是最后一个元素又不符合条件，则设置为-1
                            if (k == n - 1) {
                                result[i] = -1;
                            }
                        }
                    }
                }
            }
            return result;
        }

    }

}
