class Main{
    public static int reverseNumber(int temp){
        int ans = 0;
        while(temp>0){
            int rem = temp % 10;
            ans = ans* 10+ rem;
            temp/=10;
        }
        return ans;
    }
    public static int convert0To5(int number){
        if(number==0)
            return 5;
        else{
            int temp = 0;
            while(number>0){
                int digit = number % 10;
                if(digit==0)
                    digit = 5;
                temp = temp*10+digit;
                number/=10;
            }
            return reverseNumber(temp);
        }
    }
    public static void main(String[] args){
        int number = 2080;
        System.out.println(convert0To5(number));
    }
}