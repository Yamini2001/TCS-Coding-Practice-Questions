class Main {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" "); // Split the title into individual words
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() <= 2) {
                // If word has 1 or 2 letters, change all letters to lowercase
                result.append(word.toLowerCase());
            } else {
                // Otherwise, change the first letter to uppercase and the remaining letters to lowercase
                result.append(Character.toUpperCase(word.charAt(0))); // Capitalize first letter
                result.append(word.substring(1).toLowerCase()); // Convert remaining letters to lowercase
            }
            
            if (i < words.length - 1) {
                // Add a space after each word except for the last word
                result.append(" ");
            }
        }

        return result.toString();
    }
}
