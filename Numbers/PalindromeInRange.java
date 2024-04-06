class Main{
    public static boolean isPalindrome(int n){
        int reverse = 0;
        int temp = n;
        while(temp>0){
            reverse = reverse*10+temp%10;
            temp/=10;
        }
        if(n==reverse)
            return true;
        return false;

    }
    public static void main(String[] args){
        int min = 100;
        int max = 400;
        for(int i=min;i<=max;i++){
            if(isPalindrome(i)){
                System.out.println(i+" ");
            }
        }
    }
}
