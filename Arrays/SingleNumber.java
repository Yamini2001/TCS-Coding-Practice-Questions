import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {3, 6, 3, 6, 1, 2};
        boolean[] hasDuplicate = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    hasDuplicate[i] = true;
                    hasDuplicate[j] = true;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (!hasDuplicate[i]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
