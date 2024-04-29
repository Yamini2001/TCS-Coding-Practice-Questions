class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        boolean isFirstCapital = Character.isUpperCase(word.charAt(0)); // Check if first letter is capital
        boolean allCaps = true; // Assume all letters are capitals
        boolean allNonCaps = true; // Assume all letters are non-capitals
        
        // Check if all letters are capitals or non-capitals
        for (int i = 1; i < n; i++) {
            char c = word.charAt(i);
            if (Character.isUpperCase(c)) {
                allNonCaps = false;
            } else {
                allCaps = false;
            }
        }
        
        // If the first letter is capital and all other letters are either all capitals or all non-capitals
        return (isFirstCapital && allCaps) || (!isFirstCapital && allNonCaps) || (isFirstCapital && allNonCaps);
    }
}