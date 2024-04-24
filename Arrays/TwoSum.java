class Main {
    public static int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr = {34, 21, 46, 39, 20, 16};
        int target = 7;
        int[] result = twoSum(arr, target);

        // Check if result is empty (no indices found)
        if (result.length == 0) {
            System.out.println("No indices found.");
        } else {
            // Print the indices of the two numbers
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        }
    }

}
