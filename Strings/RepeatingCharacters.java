class Main{
    public static void main(String[] args){
        String str = "Dream World";
        int[] charCount = new int[256];
        for(char c: str.toCharArray()){
            charCount[c]++;
        }
        System.out.println("Repeating Characters: ");
        for(int i=0;i< charCount.length;i++){
            if(charCount[i]>1){
                System.out.println((char) i);
            }
        }
    }
}