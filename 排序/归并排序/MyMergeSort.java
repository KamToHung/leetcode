import java.util.Arrays;

public class MyMergeSort {

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;
        // 排序
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                result[resultIndex] = left[leftIndex];
                leftIndex++;
            } else {
                result[resultIndex] = right[rightIndex];
                rightIndex++;
            }
            resultIndex++;
        }
        // 如果左边还有剩余，直接放到结果数组中
        if (leftIndex < left.length) {
            System.arraycopy(left, leftIndex, result, resultIndex, left.length - leftIndex);
        }
        // 如果右边还有剩余，直接放到结果数组中
        if (rightIndex < right.length) {
            System.arraycopy(right, rightIndex, result, resultIndex, right.length - rightIndex);
        }
        return result;
    }

    private static int[] sort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int mid = arr.length / 2;
        // 分治，分成两个数组
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        // 归并
        return merge(sort(left), sort(right));
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 9, 2, 8, 7, 6, 4};
        int[] result = sort(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

}
