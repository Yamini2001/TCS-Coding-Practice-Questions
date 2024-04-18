class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int index= s.length()-1;
        while(index>=0 && s.charAt(index) == ' '){
            index--;
        }
        while(index>=0 && s.charAt(index) != ' '){
            length++;
            index--;
        }
        return length;
    }
    public static void main(String[] args){
        String str = "Hello World";
        System.out.println("Length of the last word: " + lengthOfLastWord(str));
    }
}