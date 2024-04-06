class Main{
    public static int reverse(int x){
        int y = 0;
        while(x>0){
            int digit = x%10;
            y = y*10+digit;
            x/=10;
        }
        return y;
    }
    public static void main(String[] args){
        int x = 123;
        int x1 = x;
        int y  =reverse(x);
        if(x1==y){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome Number");
        }
    }
}