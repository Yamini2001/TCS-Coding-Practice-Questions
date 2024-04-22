import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
class Main {
    public int solve(ArrayList<Integer> A) {
        int[] arr = new int[A.size()];
        for (int i = 0; i < A.size(); i++) {
            arr[i] = A.get(i);
        }

        // Sort the array
        Arrays.sort(arr);

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                continue;
            }
            if (arr[i] == n - 1 - i) {
                return 1;
            }
        }
        if (arr[n - 1] == 0) {
            return 1;
        }
        return -1;
    }
}
