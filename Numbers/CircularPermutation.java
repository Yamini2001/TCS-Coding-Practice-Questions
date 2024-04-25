class Main{
    public static int circularPermutation(int n){
        int result = 1;
        while(n>0){
            result = result*n;
            n--;
        }
        return result;
    }
    public static void main(String[] args){
        int n = 6;
        System.out.println(circularPermutation(n-1));
    }
}