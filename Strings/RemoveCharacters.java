class Main{
    public static String removeCharacters(String s1, int n1, String s2, int n2) {
        String s3 = " ";
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < n2; i++)
            arr[s2.charAt(i) - 'a'] = -1;
        for (int i = 0; i < n1; i++) {
            if (arr[s1.charAt(i) - 'a'] != -1) {
                s3 += s1.charAt(i);
            }
        }
        s1 = s3;
        return s1;
    }
    public static void main(String[] args){
        String string1 = "geeksforgeeks";
        String string2 = "mask";

        int n1 = string1.length();
        int n2 = string2.length();
        System.out.println(
                removeCharacters(string1, n1, string2, n2));
    }
}