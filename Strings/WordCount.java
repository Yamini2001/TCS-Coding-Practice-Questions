import java util.*;
class Main{
    public static void wordCount(String input){
        String[] words = input.split("\\s+");
        Map<String,Integer> wordcount = new HashMap<>();
        for(String word: words){
            wordcount.put(word,wordcount.getOrDefault(word,0)+1);
        }
        System.out.println("Word Count: ");
        for(Map.Entry<String,Integer> entry: wordcount.entrySet()){
            System.out.println(entry.getkey()+": "+entry.getValue());
        }
    }
    public static void main(String[] args){
        String input = "Hello World Hello World";
        wordCount(input);
    }
}