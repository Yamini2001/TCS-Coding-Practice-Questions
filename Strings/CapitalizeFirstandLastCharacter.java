public class Main {
    public static String capitalizeFirstAndLast(String str) {
        StringBuilder result = new StringBuilder();

        // Split the string into words
        String[] words = str.split("\\s+");

        // Iterate through each word
        for (String word : words) {
            if (!word.isEmpty()) { // Skip empty strings
                // Capitalize first character
                char firstChar = Character.toUpperCase(word.charAt(0));

                // Capitalize last character
                char lastChar = Character.toUpperCase(word.charAt(word.length() - 1));

                // Append modified word to result
                result.append(firstChar).append(word.substring(1, word.length() - 1)).append(lastChar).append(" ");
            }
        }

        return result.toString().trim(); // Remove trailing whitespace
    }

    public static void main(String[] args) {
        String sentence = "hello world, how are you";
        System.out.println("Original sentence: " + sentence);
        System.out.println("Modified sentence: " + capitalizeFirstAndLast(sentence));
    }
}
