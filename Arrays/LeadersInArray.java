import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        if (arr.length == 0) {
            return leaders; // Empty array, no leaders
        }
        
        int maxFromRight = arr[arr.length - 1]; // Initialize the maximum from the right
        
        // The rightmost element is always a leader
        leaders.add(maxFromRight);
        
        // Traverse the array from right to left
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i]; // Update the maximum from the right
                leaders.add(maxFromRight); // Current element is a leader
            }
        }
        
        return leaders;
    }
    
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        List<Integer> leaders = findLeaders(arr);
        
        // Print the leaders
        System.out.println("Leaders in the array:");
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }
    }
}
