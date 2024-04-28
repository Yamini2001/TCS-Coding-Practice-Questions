import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 5, 6, 7, 8, 9, 9, 10, 10,14,14,14};

        // Create a HashMap to store counts of each element
        HashMap<Integer, Integer> countsMap = new HashMap<>();

        // Calculate counts of each element
        for (int i = 0; i < arr.length; i++) {
            int currentCount = countsMap.getOrDefault(arr[i], 0);
            countsMap.put(arr[i], currentCount + 1);
        }

        // Print counts of each element
        for (int key : countsMap.keySet()) {
            int count = countsMap.get(key);
            System.out.println(key + " occurs " + count + " times");
        }
    }
}
