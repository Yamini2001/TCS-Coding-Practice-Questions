class Main{
    public static String SmallestString(String str){
        int len = str.length();
        int i = 0,j=0;
        String minWord= " ";
        int min_length = Integer.MAX_VALUE;
        int min_start = 0;
        while(j<=len){
            if(j<len && str.charAt(j)!=' ')
                j++;
            else{
                int curr_length = j-i;
                if(curr_length<min_length){
                    min_length = curr_length;
                    min_start = i;
                }
                j++;
                i=j;
            }
        }
        minWord = str.substring(min_start,min_start+min_length);
        return minWord;
    }
    public static void main(String[] args){
        String str = "I Love my India";
        System.out.println("Smallest word in a string: "+SmallestString(str));
    }
}