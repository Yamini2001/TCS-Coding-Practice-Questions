class Main{
    public static int lcs(int[] arr){
        if(arr==null || arr.length==0){
            return 0;
        }
        int currLen = 1;
        int maxLen = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                currLen++;
            }
            else{
                maxLen = Math.max(maxLen,currLen);
                currLen = 1;
            }
        }
        maxLen=Math.max(maxLen,currLen);
        return maxLen;
    }
    public static void main(String[] args){
        int[] arr={1,2,4,5,7,9,10};
        System.out.println(lcs(arr));

    }
}