/**
 * @author <a href = "kamtohung@gmail.com">KamTo Hung</a>
 */
public class PrevPermOpt1 {

    class Solution {
        public int[] prevPermOpt1(int[] arr) {
            int n = arr.length;
            for (int i = n - 1 ; i > 0 ; i--) {
                if (arr[i - 1] > arr[i]) {
                    int maxIdx = i;
                    for (int j = i ; j < n ; j++) {
                        if (arr[i - 1] > arr[j] && arr[maxIdx] < arr[j])
                            maxIdx = j;
                    }
                    swap(arr, i - 1, maxIdx);
                    break;
                }
            }
            return arr;
        }
        void swap(int[] arr, int i, int j) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
    }

}
