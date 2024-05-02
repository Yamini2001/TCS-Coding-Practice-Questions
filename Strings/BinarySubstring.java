class Solution {
    public int countBinarySubstrings(String s) {
        int count = 0;
        int prevCount = 0;
        int currCount = 1;
        for (int i = 1; i < s.length(); i++) {
             if (s.charAt(i) == s.charAt(i - 1)) {
                currCount++; // Increment the count of consecutive characters
            } else {
                // If the current character is different from the previous character
                count += Math.min(prevCount, currCount); // Add the minimum count to the total
                prevCount = currCount; // Update the previous count
                currCount = 1; // Reset the current count
            }
        }
        
        // Add the count of the last pair of consecutive groups
        count += Math.min(prevCount, currCount);
        
        return count;
    }
}