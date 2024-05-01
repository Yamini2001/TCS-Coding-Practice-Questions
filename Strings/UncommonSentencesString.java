class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> wordCount = new HashMap<>();
        countWords(s1,wordCount);
        countWords(s2,wordCount);
        List<String> uncommonWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == 1) {
                uncommonWords.add(entry.getKey());
            }
        }
        
        // Convert list to array
        return uncommonWords.toArray(new String[0]);
    }
    
    // Helper method to count occurrences of words in a sentence
    private void countWords(String sentence, Map<String, Integer> wordCount) {
        String[] words = sentence.split("\\s+");
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        } 
    }
}