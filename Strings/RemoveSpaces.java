class Main{
    public static int removeSpaces(char[] str){
        int count = 0;    
            for(int i=0;i<str.length;i++){
                if(str[i] !=' '){
                    str[count] = str[i];
                    count++;
                }
            }
            return count;
        }
        public static void main(String[] args){
            char[] str = "Move forward".tocharArray();
            int count = removeSpaces(str);
            System.out.println(String.valueOf(str).subsequence(0,count));
        }
    }