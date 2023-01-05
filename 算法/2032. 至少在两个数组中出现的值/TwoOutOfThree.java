import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoOutOfThree {

    class Solution {

        public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
            // 可以用map来做处理
            List<Integer> result = new ArrayList<>();
            Map<Integer, Integer> memo = new HashMap<>();
            // 先存放，存在则value=1
            for (int i : nums1) {
                memo.put(i, 1);
            }
            // 如果memo存在并且为1则加入到结果集,如果不存在则设置为2
            for (int i : nums2) {
                // 为2则已经在本次循环加入，不作处理
                if (memo.get(i) != null && memo.get(i) == 2) {
                    continue;
                }
                // 这里是1中存在的，判断是否存在，存在则加入到结果集
                if (memo.containsKey(i) && !result.contains(i)) {
                    result.add(i);
                } else {
                    // 设置为2避免与1重复
                    memo.put(i, 2);
                }
            }
            // nums3做同样的处理
            for (int i : nums3) {
                if (memo.get(i) != null && memo.get(i) == 3) {
                    continue;
                }
                if (memo.containsKey(i) && !result.contains(i)) {
                    result.add(i);
                } else {
                    memo.put(i, 3);
                }
            }
            return result;
        }

        public List<Integer> twoOutOfThree1(int[] nums1, int[] nums2, int[] nums3) {
            List<Integer> result = new ArrayList<>();
            // 题目中给出最大值为100，则构建容量100的数组桶
            int[] memo = new int[101];
            // nums1中存在的数据设置为1
            for (int x : nums1) {
                memo[x] = 1;
            }
            // nums2中存在与nums1相同的数据则加入结果集，并且设置为-1，防止重复加入结果集
            for (int x : nums2) {
                if (memo[x] == 1) {
                    memo[x] = -1;
                    result.add(x);
                } else if (memo[x] == 0) {
                    memo[x] = 2;
                }
            }
            // nums3中存在与nums1/nums2相同的数据则加入结果集，并且设置为-1，防止重复加入结果集
            for (int x : nums3) {
                if (memo[x] == 1 || memo[x] == 2) {
                    memo[x] = -1;
                    result.add(x);
                }
            }
            return result;
        }

        public List<Integer> twoOutOfThree2(int[] nums1, int[] nums2, int[] nums3) {
            // lambda一气呵成
            return Stream.of(nums1, nums2, nums3)
                    .flatMap(o -> Arrays.stream(o).distinct().boxed())
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet()
                    .stream()
                    .filter(o -> o.getValue() >= 2)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());
        }

    }

}
