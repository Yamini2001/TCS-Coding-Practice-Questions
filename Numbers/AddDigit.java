class Main{
    public static int addDigit(int num){
        while(num>=10){
            int sum = 0;
            while(num>0){
                sum+=num%10;
                num/=10;
            }
            num=sum;
        }
        return num;
    }
    public static void main(String[] args){
        int num=65;
        System.out.println(addDigit(num));
    }
}